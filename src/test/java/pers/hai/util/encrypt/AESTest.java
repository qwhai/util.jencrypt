package pers.hai.util.encrypt;

import org.apache.log4j.Logger;
import org.junit.Test;
import pers.hai.util.encrypt.interf.Decrypt;
import pers.hai.util.encrypt.interf.Encrypt;
import pers.hai.util.encrypt.utils.ArrayUtils;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 16:08
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class AESTest {

    private final Logger logger = Logger.getLogger(AESTest.class);

    @Test
    public void test1() {
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Encrypt encrypt = new AES();
        ((AES) encrypt).setKey(key);

        byte[] cipher = encrypt.encrypt("你好，世界".getBytes());
        logger.info(ArrayUtils.output(cipher));
    }

    @Test
    public void test2() {
        byte[] cipher = {
                66, -49, -31, 51, 92, 103, -31, 104, -83, -57, 113, 40, 18, -116, -47, -58
        };
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Decrypt decrypt = new AES();
        ((AES) decrypt).setKey(key);

        byte[] plain = decrypt.decrypt(cipher);
        logger.info(ArrayUtils.output(plain));
        logger.info(new String(plain));
    }
}
