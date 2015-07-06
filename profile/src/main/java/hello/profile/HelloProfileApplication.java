package hello.profile;

import hello.profile.service.impl.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ouyang
 * @since 2015-07-03 18:06
 */
@SpringBootApplication
public class HelloProfileApplication implements CommandLineRunner {

    @Autowired
    private IMessageService helloWorldService;

    @Override
    public void run(String... args) {
        System.out.println(this.helloWorldService.say());
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloProfileApplication.class, args);
    }
}
