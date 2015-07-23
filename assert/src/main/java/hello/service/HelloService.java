package hello.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author ouyang
 * @since 2015-07-14 11:08
 */
@Service
public class HelloService {

    @Autowired
    private RunService runService;


    public void hello(String name) {
        Assert.notNull(name, "name不能为空");

        System.out.println("Hello " + name);

        runService.run("thi");

    }

}
