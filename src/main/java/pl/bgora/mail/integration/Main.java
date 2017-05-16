package pl.bgora.mail.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("integration/mail.xml")
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class, args);
    }
}
