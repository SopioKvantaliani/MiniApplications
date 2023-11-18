package projects.miniapplications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projects.miniapplications.task1.PasswordValidator;
import projects.miniapplications.task2.GenerateAndCheckPassword;

import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class MiniApplicationsApplication {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        SpringApplication.run(MiniApplicationsApplication.class, args);

        System.out.println("______________________________________________");
        PasswordValidator.checkApplicationPassword();

        System.out.println("------------------------------------------------");

        String filePath = "md5hash.txt";
        String md5Hash = GenerateAndCheckPassword.readMd5HashFromFile(filePath);
        GenerateAndCheckPassword.checkPassword(md5Hash);

    }

}
