package com.threequick.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Spring Boot应用的入口类
 *
 * @author Frank Zhang
 */
@ImportResource(locations = {"classpath*:app-boot-start.xml"})
@SpringBootApplication(scanBasePackages = {"com.threequick.crm", "com.alibaba.sofa"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
