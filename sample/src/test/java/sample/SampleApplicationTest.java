package sample;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;

/**
 * test for {@link sample.SampleApplication }
 *
 * @author ouyang
 * @since 2015-07-03 13:10
 */
public class SampleApplicationTest {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    private String profiles;

    @Before
    public void init() {
        this.profiles = System.getProperty("spring.profiles.active");
    }

    @After
    public void after() {
        if (this.profiles != null) {
            System.setProperty("spring.profiles.active", this.profiles);
        } else {
            System.clearProperty("spring.profiles.active");
        }
    }

    @Test
    public void testDefaultSettings() {
        SampleApplication.main(new String[]{});
        String output = this.outputCapture.toString();
        TestCase.assertTrue("Wrong output: " + output, output.contains("Hello ouyang"));
    }

    @Test
    public void testCommandLineOverrides() {
        SampleApplication.main(new String[]{"--name=shuang"});
        String output = this.outputCapture.toString();
        TestCase.assertTrue("Wrong output: " + output, output.contains("Hello shuang"));
    }

}
