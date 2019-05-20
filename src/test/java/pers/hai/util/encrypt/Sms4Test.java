package pers.hai.util.encrypt;

import org.apache.log4j.Logger;
import org.junit.Test;
import pers.hai.util.encrypt.interf.Decrypt;
import pers.hai.util.encrypt.interf.Encrypt;
import pers.hai.util.encrypt.utils.ArrayUtils;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 16:07
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class Sms4Test {

    private final Logger logger = Logger.getLogger(Sms4Test.class);

    @Test
    public void test1() {
        String plaintext = "Hello world";
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Encrypt encrypt = new SMS4();
        ((SMS4) encrypt).setKey(key);

        byte[] cipher = encrypt.encrypt(plaintext.getBytes());
        if (null == cipher)
            return;
        logger.info(ArrayUtils.output(cipher));
    }

    @Test
    public void test2() {
        String plaintext = "你好，世界";
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Encrypt encrypt = new SMS4();
        ((SMS4) encrypt).setKey(key);

        byte[] cipher = encrypt.encrypt(plaintext.getBytes());
        if (null == cipher) return;
        logger.info(ArrayUtils.output(cipher));
    }

    @Test
    public void test3() {
        byte[] cipher = {
                -43, -115, -7, -92, 111, 82, 63, -69, 20, -32, 10, 62, -109, -35, 101, -55
        };
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Decrypt decrypt = new SMS4();
        ((SMS4) decrypt).setKey(key);

        byte[] data = decrypt.decrypt(cipher);
        if (null == data) return;
        logger.info(new String(data).trim());
    }

    @Test
    public void test4() {
        byte[] cipher = {
                96, -87, -49, 31, -125, 29, -62, -74, -96, 1, 127, -8, -52, 107, -82, 8
        };
        byte[] key = {
                0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08,
                0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f, 0x10
        };

        Decrypt decrypt = new SMS4();
        ((SMS4) decrypt).setKey(key);

        byte[] data = decrypt.decrypt(cipher);
        if (null == data) return;
        logger.info(new String(data).trim());
    }
}
