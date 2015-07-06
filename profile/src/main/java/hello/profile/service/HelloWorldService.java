package hello.profile.service;

import hello.profile.service.impl.IMessageService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author ouyang
 * @since 2015-07-03 18:11
 */
@Service
@Profile({ "hello", "default" })
public class HelloWorldService implements IMessageService {

    @Value("${name:World}")
    private String name;

    @Override
    public String say() {
        return "Hello " + this.name;
    }
}
