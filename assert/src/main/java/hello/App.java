package hello;

import hello.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ouyang
 * @since 2015-07-14 11:05
 */
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private HelloService helloService;

    public static void main(String... args) {
        SpringApplication.run(App.class,args);
    }

    @Override
    public void run(String... args) throws Exception {

        try {

//            helloService.hello("xxx");
            System.out.println("_______________________");
            helloService.hello(null);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
