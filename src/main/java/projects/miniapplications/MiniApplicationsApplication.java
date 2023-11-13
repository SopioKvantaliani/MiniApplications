package projects.miniapplications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import projects.miniapplications.task1.PasswordValidator;

@SpringBootApplication
public class MiniApplicationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniApplicationsApplication.class, args);

        PasswordValidator.checkApplicationPassword();


    }

}
