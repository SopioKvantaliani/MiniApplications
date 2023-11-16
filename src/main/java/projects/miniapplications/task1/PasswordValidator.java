package projects.miniapplications.task1;

import java.util.Scanner;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

public class PasswordValidator {

    public static void checkApplicationPassword(){
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid){

            System.out.println("Please enter Password");
            String password = scanner.nextLine();

            if (isValidPassword (password)){
                isValid=true;
                System.out.println("Password is valid");

                try {
                    String md5Hash = GenerateMD5Hash.generateMD5Hash(password);
                    MD5HashFileWriter.saveMD5HashToFile(md5Hash);
                } catch (NoSuchAlgorithmException | IOException e) {
                    System.out.println("Error saving MD5 hash to file: " + e.getMessage());
                }


            }else{
                System.out.println("Invalid password!! Password should have no more than 3 characters, and can only contain uppercase/lowercase letters or numbers.");
            }
        }
        scanner.close();
}



    private static boolean isValidPassword (String password){
        return !password.trim().isEmpty() && password.matches("[A-Za-z0-9]{1,3}");
    }
}
