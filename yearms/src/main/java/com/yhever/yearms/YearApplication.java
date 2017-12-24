package com.yhever.yearms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Hello world!
 *
 */
@Controller
@EnableEurekaClient
@EnableAutoConfiguration
public class YearApplication {

    @RequestMapping("/hiyear")
    @ResponseBody
    String home() {
        return "Hello World this is year micro service!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(YearApplication.class, args);
    }
}