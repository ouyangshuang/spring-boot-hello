package hello.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * @author ouyang
 * @since 2015-07-14 11:10
 */
@Service
public class RunService {

    public void run(String thing){
        Assert.isTrue("thing".equals(thing), "参数不对呀。。");

        System.out.println("this......");

    }

}
