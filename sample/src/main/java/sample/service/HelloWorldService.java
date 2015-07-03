package sample.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author ouyang
 * @since 2015-07-03 11:52
 */
@Service
public class HelloWorldService {

    @Value("${name:World}")
    private String name;

    public String say() {
        return "Hello " + this.name;
    }
}
