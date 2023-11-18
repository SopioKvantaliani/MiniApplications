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

        String targetHash = "86af1c2fd820797c1b2b39c09ade58b6";
        GenerateAndCheckPassword.checkPassword(targetHash);

    }

}
