package pers.hai.util.encrypt;

import org.apache.log4j.Logger;
import org.junit.Test;
import pers.hai.util.encrypt.interf.Encoder;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 16:06
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class SHA1Test {

    private final Logger logger = Logger.getLogger(SHA1Test.class);

    @Test
    public void test1() {
        Encoder encoder = new SHA1();
        logger.info(encoder.encode("Hello world"));
    }

    @Test
    public void test2() {
        Encoder encoder = new SHA1();
        logger.info(encoder.encode("你好，世界"));
    }
}
