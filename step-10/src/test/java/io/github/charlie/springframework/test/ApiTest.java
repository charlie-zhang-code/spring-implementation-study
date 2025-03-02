package io.github.charlie.springframework.test;

import io.github.charlie.springframework.context.support.ClassPathXmlApplicationContext;
import io.github.charlie.springframework.test.bean.UserService;
import io.github.charlie.springframework.test.event.CustomEvent;
import org.junit.Test;
import org.openjdk.jol.info.ClassLayout;

public class ApiTest {
    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));
        applicationContext.registerShutdownHook();
    }
}
