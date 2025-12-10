public class StrongCipherAlgorithmCheck {

    public static void main(String[] args) throws Exception {
        // Noncompliant - Using DES algorithm
        javax.crypto.Cipher desCipher = javax.crypto.Cipher.getInstance("DES");
        desCipher.init(javax.crypto.Cipher.ENCRYPT_MODE, null); // Noncompliant

        // Noncompliant - Using RC4 algorithm
        javax.crypto.Cipher rc4Cipher = javax.crypto.Cipher.getInstance("RC4");
        rc4Cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, null); // Noncompliant

        // Compliant - Using AES algorithm
        javax.crypto.Cipher aesCipher = javax.crypto.Cipher.getInstance("AES");
        aesCipher.init(javax.crypto.Cipher.ENCRYPT_MODE, null);

        // Compliant - Using AES/GCM algorithm
        javax.crypto.Cipher aesGcmCipher = javax.crypto.Cipher.getInstance("AES/GCM");
        aesGcmCipher.init(javax.crypto.Cipher.ENCRYPT_MODE, null);
    }
}
