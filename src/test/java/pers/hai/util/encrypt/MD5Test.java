package pers.hai.util.encrypt;

import org.apache.log4j.Logger;
import org.junit.Test;
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
public class MD5Test {

    private final Logger logger = Logger.getLogger(MD5Test.class);

    @Test
    public void test1() {
        Encoder encoder = new MD5();
        logger.info(encoder.encode("Hello world"));
    }

    @Test
    public void test2() {
        Encoder encoder = new MD5();
        logger.info(encoder.encode("你好，世界"));
    }
}
