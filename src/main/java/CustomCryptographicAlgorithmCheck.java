public class CustomCryptographicAlgorithmCheck {

    // Noncompliant - Using a weak cryptographic algorithm (MD5)
    public String hashPasswordMD5(String password) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] passwordBytes = password.getBytes();
            byte[] hashBytes = md.digest(passwordBytes);
            return java.util.Base64.getEncoder().encodeToString(hashBytes);
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Noncompliant - Using a weak cryptographic algorithm (DES)
    public String encryptDataDES(String data) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("DES");
            cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, generateDESKey());
            byte[] dataBytes = data.getBytes();
            byte[] encryptedBytes = cipher.doFinal(dataBytes);
            return java.util.Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException | 
                 javax.crypto.IllegalBlockSizeException | javax.crypto.BadPaddingException | 
                 java.security.InvalidKeyException e) {
            e.printStackTrace();
            return null;
        }
    }

    private javax.crypto.SecretKey generateDESKey() throws java.security.NoSuchAlgorithmException {
        return javax.crypto.KeyGenerator.getInstance("DES").generateKey();
    }

    // Compliant - Using a strong cryptographic algorithm (SHA-256)
    public String hashPasswordSHA256(String password) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-256");
            byte[] passwordBytes = password.getBytes();
            byte[] hashBytes = md.digest(passwordBytes);
            return java.util.Base64.getEncoder().encodeToString(hashBytes);
        } catch (java.security.NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Compliant - Using a strong cryptographic algorithm (AES)
    public String encryptDataAES(String data) {
        try {
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES");
            cipher.init(javax.crypto.Cipher.ENCRYPT_MODE, generateAESKey());
            byte[] dataBytes = data.getBytes();
            byte[] encryptedBytes = cipher.doFinal(dataBytes);
            return java.util.Base64.getEncoder().encodeToString(encryptedBytes);
        } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException | 
                 javax.crypto.IllegalBlockSizeException | javax.crypto.BadPaddingException | 
                 java.security.InvalidKeyException e) {
            e.printStackTrace();
            return null;
        }
    }

    private javax.crypto.SecretKey generateAESKey() throws java.security.NoSuchAlgorithmException {
        return javax.crypto.KeyGenerator.getInstance("AES").generateKey();
    }
}
