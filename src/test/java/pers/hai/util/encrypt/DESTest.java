package pers.hai.util.encrypt;

import org.apache.log4j.Logger;
import org.junit.Test;
import pers.hai.util.encrypt.interf.Decrypt;
import pers.hai.util.encrypt.interf.Encrypt;
import pers.hai.util.encrypt.utils.ArrayUtils;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 16:10
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class DESTest {

    private final Logger logger = Logger.getLogger(DESTest.class);

    @Test
    public void test1() {
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Encrypt encrypt = new DES();
        ((DES) encrypt).setKey(key);

        byte[] cipher = encrypt.encrypt("你好，世界".getBytes());
        logger.info(ArrayUtils.output(cipher));
    }

    @Test
    public void test2() {
        byte[] cipher = {
                126, -87, 82, -22, -70, 91, 98, -12, 70, 15, 43, 9, -37, 102, -99, 125
        };
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Decrypt decrypt = new DES();
        ((DES) decrypt).setKey(key);

        byte[] plain = decrypt.decrypt(cipher);
        logger.info(ArrayUtils.output(plain));
        logger.info(new String(plain));
    }
}
