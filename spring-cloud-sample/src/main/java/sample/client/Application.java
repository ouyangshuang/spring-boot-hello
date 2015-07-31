package sample.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author ouyang
 * @since 2015-07-22 17:33
 */
@Configuration
@EnableAutoConfiguration
@RestController
public class Application implements CommandLineRunner {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("######4444######");
        Environment environment = webApplicationContext.getEnvironment();
        System.out.println("");
        System.out.println("######4444######");
    }
}

