void generateSymmetricKey() {
    try {
        Random r = new Random();
        int num = r.nextInt(10000);
        String knum = String.valueOf(num);
        char[] password = knum.toCharArray();
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
        KeySpec spec = new PBEKeySpec(password, knum.getBytes(), 65536, 256);
        SecretKey tmp = factory.generateSecret(spec);
        SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "DES");

        raw = secret.getEncoded();
        skeyString = new String(raw);
        System.out.println("DES Symmetric key = " + skeyString);
    } catch (Exception e) {
        System.out.println(e);
    }
}

