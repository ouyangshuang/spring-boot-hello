package sample;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * test for {@link sample.SampleApplication }
 *
 * @author ouyang
 * @since 2015-07-03 13:34
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SampleApplication.class)
public class SpringSampleApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void testContextLoads() {
        TestCase.assertNotNull(this.applicationContext);
        TestCase.assertTrue(this.applicationContext.containsBean("helloWorldService"));
        TestCase.assertTrue(this.applicationContext.containsBean("sampleApplication"));
    }

}
