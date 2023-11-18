package projects.miniapplications.task2;

import projects.miniapplications.task1.GenerateMD5Hash;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class GenerateAndCheckPassword {

    public static void checkPassword(String targetHash) throws NoSuchAlgorithmException {
        // Password criteria
        String validCharacters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        // Loop through all possible combinations
        for (int i = 0; i < validCharacters.length(); i++) {
            char char1 = validCharacters.charAt(i);
            for (int j = 0; j < validCharacters.length(); j++) {
                char char2 = validCharacters.charAt(j);
                for (int k = 0; k < validCharacters.length(); k++) {
                    char char3 = validCharacters.charAt(k);

                    String password = "" + char1 + char2 + char3;
                    String hashedPassword = GenerateMD5Hash.generateMD5Hash(password);

                    // Check if the hash matches the target hash
                    if (hashedPassword.equals(targetHash)) {
                        System.out.println("Password found: " + password);
                        return; // Terminate the program after finding the password
                    }
                }
            }
        }
        System.out.println("Password not found.");
    }

    public static String readMd5HashFromFile(String filePath) {
        StringBuilder hashBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Append each line to the StringBuilder
                hashBuilder.append(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading md5hash.txt: " + e.getMessage());
        }

        // Convert the StringBuilder to a string and return
        return hashBuilder.toString();
    }
}
