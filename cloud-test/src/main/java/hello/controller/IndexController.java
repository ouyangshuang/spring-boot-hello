package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ouyang
 * @since 2015-07-27 16:18
 */
@RestController
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

}
