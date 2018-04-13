package team.ruike.cim;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import team.ruike.cim.SmartApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SmartApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class SmartApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void get() throws Exception {
    	System.out.println("get");
        /*Map<String,String> multiValueMap = new HashMap<>();
        multiValueMap.put("username","lake");//传值，但要在url上配置相应的参数
        testRestTemplate.getForObject("/test/get?username={username}", String.class, multiValueMap);*/
    }
}
