package team.ruike.cim;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@MapperScan("team.ruike.cim.dao")
public class SmartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ThreadPoolTaskExecutor createTaskPool() {
        ThreadPoolTaskExecutor tp = new ThreadPoolTaskExecutor();
        tp.setCorePoolSize(4);
        tp.setMaxPoolSize(16);
        tp.setKeepAliveSeconds(300);
        return tp;
    }
}