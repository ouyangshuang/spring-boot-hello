package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyang
 * @since 2015-07-23 18:31
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/greeting")
    public String greeting(){
        return "{\"id\":1,\"content\":\"Hello, World!\"}";
    }
}
