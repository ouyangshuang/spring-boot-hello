package sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sample.service.HelloWorldService;

/**
 * @author ouyang
 * @since 2015-07-03 11:51
 */
@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SampleApplication.class);

    @Autowired
    private HelloWorldService helloWorldService;

    @SuppressWarnings("ElementOnlyUsedFromTestCode")
    public static void main(String... args) {
        SpringApplication.run(SampleApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info(helloWorldService.say());
    }
}
