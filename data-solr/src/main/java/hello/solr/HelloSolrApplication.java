package hello.solr;

import com.alibaba.fastjson.JSON;
import hello.solr.service.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ouyang
 * @since 2015-07-06 10:51
 */
@SpringBootApplication
public class HelloSolrApplication implements CommandLineRunner {


    @Autowired
    private PropertyRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        repository.deleteAll();

        repository.save(new Property("1", "汤臣一品", " A栋08", "3501"));
        repository.save(new Property("2", "中粮海景壹号", " 08", "1601"));
        repository.save(new Property("3", "御翠园", " 20", "0000"));

        System.out.println("Property found by findAll():");
        System.out.println("---------------------------");
        for (Property property : repository.findAll()){
            System.out.println(JSON.toJSON(property));
        }
        System.out.println();
    }

    public static void main(String... args) {
        SpringApplication.run(HelloSolrApplication.class,args);
    }
}
