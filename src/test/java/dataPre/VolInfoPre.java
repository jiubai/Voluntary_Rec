/**
 * User: Jiubai
 * Date: 2021/3/5 16:51
 */

package dataPre;

import com.Jiubai.mapper.VolunteerMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.*;
import java.util.*;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
// 自动创建 ioc 容器
@ContextConfiguration(locations = {"classpath:mybatis-spring-mapper.xml"})
public class VolInfoPre {
    @Autowired
    VolunteerMapper volunteerMapper;

    private final String activeAllTimePath = "D:\\Pycharm\\Project\\Remote\\ArticleData\\Data\\Public\\train.txt";
    private final String activePath = "D:\\Pycharm\\Project\\Remote\\ArticleData\\Data\\"+Constants.DAY+"\\train.txt";
    private final String offlineAllTimePath = "D:\\Pycharm\\Project\\Remote\\ArticleData\\Data\\Public\\offline.txt";
    private final String offlinePath = "D:\\Pycharm\\Project\\Remote\\ArticleData\\Data\\"+Constants.DAY+"\\offline.txt";

    private Map<Integer, Integer> volMap = new HashMap<>();
    // Spring测试下，junit的相关注解也不能省啊
    @Test
    public void storeDataFirstStage(){
        registry(volMap, activeAllTimePath, Constants.ACTIVE);
        registry(volMap, activePath, Constants.ACTIVE);

        registry(volMap, offlineAllTimePath, Constants.OFFLINE);
        registry(volMap, offlinePath, Constants.OFFLINE);
        System.out.println(volMap.size());
    }

    public void registry(Map<Integer, Integer> volMap, String filePath, int status){
        // 建立一个对象，它把文件内容转成计算机能读懂的语言
        try (FileReader reader = new FileReader(filePath);
             BufferedReader br = new BufferedReader(reader)
        ) {
            String line;
            while (null != (line = br.readLine())) {
                String vol = line.split("\\|")[0];
                try{
                    vol = vol.substring(0,vol.lastIndexOf("_"));
                }catch (Exception e){
                    continue;
                }
                Integer vol_ = Integer.parseInt(vol);
                if (!volMap.containsKey(vol_)){
                    volMap.put(vol_, status);
                }
            }
        } catch (Exception e) {
            log.info("Exception when read file");
            e.printStackTrace();
        }
    }

}
