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
public class RC4Test {

    private final Logger logger = Logger.getLogger(RC4Test.class);

    @Test
    public void test1() {
        String key = "123456";

        Encrypt encrypt = new RC4();
        ((RC4) encrypt).setKey(key);

        byte[] cipher = encrypt.encrypt("你好，世界".getBytes());
        logger.info(ArrayUtils.output(cipher));
    }

    @Test
    public void test2() {
        byte[] cipher = {
                -28, 69, -34, -126, -127, -114, -6, 32, -13, -45, -102, 32, 30, -85, -51
        };
        String key = "123456";

        Decrypt decrypt = new RC4();
        ((RC4) decrypt).setKey(key);

        byte[] plain = decrypt.decrypt(cipher);
        logger.info(ArrayUtils.output(plain));
        logger.info(new String(plain));
    }
}
