package collection;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by WANGDD on 2017/5/22.
 * 数组相关测试
 */
public class ArrayTest {

    private static final Logger logger = LoggerFactory.getLogger(ArrayTest.class);

    @Test
    public void arrayLengthTest() {
        String str = "2030200,2030100,2030300,2030000,2080100,2080200,2080000,2020200,2020100,2020000,2070100,2070000,2040100,2040400,2040300,2040200,2040000,2050200,2050100,2050400,2050300,2050000,2060200,2060100,2060000,2010000,2000000,2030400,2030500,2030600,3100200,3100100,3100000,3080300,3080400,3080100,3080200,3080000,3010000,3090100,3090200,3090300,3090000,3030300,3030200,3030100,3030000,3040200,3040100,3040000,3050200,3050100,3050000,3000000,4010000,4070100,4070000,4020100,4020000,4030100,4030000,4060100,4060000,4040100,4040200,4040300,4040000,4050100,4050000,4000000,5010300,5010200,5010100,5010000,5020100,5020200,5020000,5000000,6010300,6010400,6010100,6010200,6010000,6040100,6040000,6030100,6030200,6030000,6000000\n";
        String crm = "3100200,3100100,3100000,3080300,3080400,3080100,3080200,3080000,3010000,3090100,3090200,3090300,3090000,3030300,3030200,3030100,3030000,3040200,3040100,3040000,3050200,3050100,3050000,3000000\n";
        String stuIds = "";
        String[] strArray = str.split(",");
        String[] crmArray = crm.split(",");
        String[] stuIdArray = stuIds.split(",");
        logger.info("数组长度：" + strArray.length);
        logger.info("CRM数组长度：" + crmArray.length);
        logger.info("stu数组长度：" + stuIdArray.length);
//        for (int i = 0; i < strArray.length; i++) {
//            Long a = Long.valueOf(strArray[i]);
//            System.out.println(i);
//        }
    }
}