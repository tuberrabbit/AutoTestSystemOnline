import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Administrator on 2015/2/17.
 */
public class HelloTest {
    @Test
    public void test_say_hello() throws Exception {
        MessagePrinter printer = new MessagePrinter();
        assertFalse(printer.sayHello());
    }
}
