/**
 * User: Jiubai
 * Date: 2021/3/5 16:01
 */

package dataPre;

import com.Jiubai.mapper.RecResultMapper;
import com.Jiubai.pojo.entity.RecResult;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.File;
import java.util.Iterator;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
// 自动创建 ioc 容器
@ContextConfiguration(locations = {"classpath:mybatis-spring-mapper.xml"})
public class RecInfoPre {

    @Autowired
    RecResultMapper recResultMapper;

    private final String strText = "D:\\Pycharm\\Project\\Remote\\ArticleOne\\MajorEdits\\Final\\Merge\\Result\\My_Merge_Res_" + Constants.DAY + ".json";

    // Spring测试下，junit的相关注解也不能省啊
    @Test
    public void storeData(){
        ObjectMapper objMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objMapper.readTree(new File(strText));
            // 获得 json 字符串
            Iterator<String> fieldNames = rootNode.fieldNames();
            while(fieldNames.hasNext()){
                String nextField = fieldNames.next();
                String nextValue = rootNode.get(nextField).toString();
                Integer volId = Integer.parseInt(nextField.substring(0,nextField.lastIndexOf("_")));
                recResultMapper.insertSelective(new RecResult(volId, nextValue));
            }
        }
        catch (Exception e) {
            log.info("Exception when extract json file");
            e.printStackTrace();
        }
    }

}
