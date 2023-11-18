package projects.miniapplications.task1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GenerateMD5Hash {

    public static String generateMD5Hash(String input) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytes = md.digest(input.getBytes());

        // Convert byte array to a hexadecimal string
        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}