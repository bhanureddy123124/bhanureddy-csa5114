import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class std {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            System.out.println("Message digest object info: ");
            System.out.println(" Algorithm = " + md.getAlgorithm());
            System.out.println(" Provider = " + md.getProvider());
            System.out.println(" ToString = " + md.toString());

            String input = "";
            printHash("SHA-1", input);

            input = "abc";
            printHash("SHA-1", input);

            input = "abcdefghijklmnopqrstuvwxyz";
            printHash("SHA-1", input);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not available: " + e);
        }
    }

    private static void printHash(String algorithm, String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance(algorithm);
        md.update(input.getBytes());
        byte[] output = md.digest();
        System.out.println();
        System.out.println(algorithm + "(\"" + input + "\") = " + bytesToHex(output));
    }

    private static String bytesToHex(byte[] b) {
        char[] hexDigit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder buf = new StringBuilder();
        for (byte value : b) {
            buf.append(hexDigit[(value >> 4) & 0x0f]);
            buf.append(hexDigit[value & 0x0f]);
        }
        System.out.println(buf.toString());
        return buf.toString();
    }
}
