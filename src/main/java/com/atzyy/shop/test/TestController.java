package com.atzyy.shop.test;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
//@Slf4j
public class TestController {
    //手动注入日志 也可以通过 @Slf4j,使用注解需要引入 lombok 包依赖
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/logTest")
    public void logTest(){
        log.trace("trace...");
        log.debug("debug...");
        log.warn("warn...");
        log.info("info...");
        log.error("error...");
    }

}
