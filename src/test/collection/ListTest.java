package collection;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by WANGDD on 2017/4/1.
 */
public class ListTest {

    private static final Logger logger = LoggerFactory.getLogger(ListTest.class);

    @Test
    public void ListTest() {
        List<Map<String, Object>> mapList = new ArrayList<>();
        int i = 0;
//        for (Map<String, Object> item : mapList) {
//            logger.info("第" + i + "次");
//            i++;
//        }
        Map<String, Object> map = mapList.get(0);
    }

    @Test
    public void ListToJsonString() {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(i + "");
        }
        logger.info("返回结果：" + JSONObject.toJSONString(list));
    }
}
