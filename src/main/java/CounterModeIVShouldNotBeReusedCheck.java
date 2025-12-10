public class CounterModeIVShouldNotBeReusedCheck {

    // Noncompliant - Reusing the same IV across multiple encryptions with the same key.
    public void nonCompliantExample1() {
        byte[] key = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10};
        byte[] iv = {0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18};
        byte[] plaintext1 = "This is the first message".getBytes();
        byte[] plaintext2 = "This is the second message".getBytes();

        // Using the same IV for both encryptions
        byte[] ciphertext1 = encrypt(key, iv, plaintext1);
        byte[] ciphertext2 = encrypt(key, iv, plaintext2); // Noncompliant
    }

    // Noncompliant -  Reusing IV even with different keys is problematic in some contexts.
    public void nonCompliantExample2() {
        byte[] iv = {0x11, 0x12, 0x13, 0x14, 0x15, 0x16, 0x17, 0x18};
        byte[] key1 = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10};
        byte[] key2 = {0x1a, 0x1b, 0x1c, 0x1d, 0x1e, 0x1f, 0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x29};
        byte[] plaintext1 = "Message 1".getBytes();
        byte[] plaintext2 = "Message 2".getBytes();

        byte[] ciphertext1 = encrypt(key1, iv, plaintext1);
        byte[] ciphertext2 = encrypt(key2, iv, plaintext2); // Noncompliant
    }

    // Compliant - Using a unique IV for each encryption.
    public void compliantExample1() {
        byte[] key = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10};
        byte[] plaintext1 = "This is the first message".getBytes();
        byte[] plaintext2 = "This is the second message".getBytes();

        byte[] iv1 = generateIV();
        byte[] iv2 = generateIV();

        byte[] ciphertext1 = encrypt(key, iv1, plaintext1);
        byte[] ciphertext2 = encrypt(key, iv2, plaintext2);
    }

    // Compliant - Using a different IV for each encryption.
    public void compliantExample2() {
        byte[] key = {0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10};
        byte[] plaintext1 = "Message 1".getBytes();
        byte[] plaintext2 = "Message 2".getBytes();

        byte[] iv1 = {0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28};
        byte[] iv2 = {0x31, 0x32, 0x33, 0x34, 0x35, 0x36, 0x37, 0x38};

        byte[] ciphertext1 = encrypt(key, iv1, plaintext1);
        byte[] ciphertext2 = encrypt(key, iv2, plaintext2);
    }

    private byte[] encrypt(byte[] key, byte[] iv, byte[] plaintext) {
        // Simulate encryption - in a real scenario, use a proper encryption algorithm
        return plaintext;
    }

    private byte[] generateIV() {
        // Simulate IV generation - in a real scenario, use a secure random number generator
        return new byte[]{0x41, 0x42, 0x43, 0x44, 0x45, 0x46, 0x47, 0x48};
    }
}
