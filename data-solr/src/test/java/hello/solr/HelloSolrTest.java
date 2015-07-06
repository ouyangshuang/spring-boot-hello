package hello.solr;

import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.OutputCapture;
import org.springframework.core.NestedCheckedException;


import static org.junit.Assert.assertTrue;

/**
 * @author ouyang
 * @since 2015-07-06 11:00
 */
public class HelloSolrTest {

    @Rule
    public OutputCapture outputCapture = new OutputCapture();

    @Test
    public void testDefaultSettings() throws Exception {

        try {
            HelloSolrApplication.main(new String[0]);
        }
        catch (IllegalStateException ex) {
            if (serverNotRunning(ex)) {
                return;
            }
        }
        String output = this.outputCapture.toString();
        assertTrue("Wrong output: " + output, output.contains("estateName=汤臣一品"));
    }

    private boolean serverNotRunning(IllegalStateException ex) {

        @SuppressWarnings("serial")
        NestedCheckedException nested = new NestedCheckedException("failed", ex) {
        };
        Throwable root = nested.getRootCause();
        if (root.getMessage().contains("Connection refused")) {
            return true;
        }
        return false;
    }
}
