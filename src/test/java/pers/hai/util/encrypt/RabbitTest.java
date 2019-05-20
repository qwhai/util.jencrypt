package pers.hai.util.encrypt;

import org.apache.log4j.Logger;
import org.junit.Test;
import pers.hai.util.encrypt.utils.ArrayUtils;

/**
 * TODO
 * <p>
 * Create Time: 2019-05-20 16:11
 * Last Modify: 2019-05-20
 *
 * @author Q-WHai
 * @see <a href="https://github.com/qwhai">https://github.com/qwhai</a>
 */
public class RabbitTest {

    private final Logger logger = Logger.getLogger(RabbitTest.class);

    @Test
    public void test1() {
        byte[] key = {
                (byte)0xa0, (byte)0x33, (byte)0xd6, (byte)0x78,
                (byte)0x6b, (byte)0x05, (byte)0x14, (byte)0xac,
                (byte)0xfc, (byte)0x3d, (byte)0x8e, (byte)0x2d,
                (byte)0x6a, (byte)0x2c, (byte)0x27, (byte)0x1d
        };
        byte[] data = {
                126, -87, 82, -22, -70, 91, 98, -12, 70, 15, 43, 9, -37, 102, -99, 125
        };

        Rabbit rabbit = new Rabbit();
        rabbit.setKey(key);

        byte[] cipher;
        for (int i = 0; i < 20; i++) {
            cipher = rabbit.encrypt(data);
            logger.info(String.format("第%d次加密：%s", i + 1, ArrayUtils.output(cipher)));
        }
    }
}
