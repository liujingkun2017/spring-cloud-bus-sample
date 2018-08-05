package org.liujk.spring.cloud.bus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringCloudBusSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudBusSampleApplication.class, args);
    }

    @Value("${foo}")
    private String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }
}
