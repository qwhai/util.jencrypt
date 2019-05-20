package pers.hai.util.encrypt;

import org.apache.log4j.Logger;
import org.junit.Test;
import pers.hai.util.encrypt.interf.Decoder;
import pers.hai.util.encrypt.interf.Encoder;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 16:05
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Base64Test {

    private final Logger logger = Logger.getLogger(Base64Test.class);

    @Test
    public void test1() {
        Encoder encoder = new Base64();
        logger.info(encoder.encode("Hello world"));
    }

    @Test
    public void test2() {
        Encoder encoder = new Base64();
        logger.info(encoder.encode("你好，世界"));
    }

    @Test
    public void test3() {
        Encoder encoder = new Base64();
        logger.info(encoder.encode("你好，世界".getBytes()));
    }

    @Test
    public void test4() {
        Decoder decoder = new Base64();
        logger.info(decoder.decode("SGVsbG8gd29ybGQ=".getBytes()));
    }

    @Test
    public void test5() {
        Decoder decoder = new Base64();
        logger.info(decoder.decode("5L2g5aW977yM5LiW55WM".getBytes()));
    }

    @Test
    public void test6() {
        Decoder decoder = new Base64();
        logger.info(decoder.decode("5L2g5aW977yM5LiW55WM"));
    }
}
