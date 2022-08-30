package guyue.qywx.hhcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author guyue
 * @version 3.0
 * @description: TODO
 * @date 2022/8/29 下午5:30
 */
@SpringBootApplication
@EnableFeignClients("guyue.qywx.hhcd.client")
public class AppConfig {
    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class);
    }
}
