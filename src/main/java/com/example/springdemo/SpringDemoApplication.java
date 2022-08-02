package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
//        Triangle triangle = (Triangle) new XmlBeanFactory(new ClassPathResource("spring.xml")).getBean("triangle");
//        var context = new ClassPathXmlApplicationContext("spring.xml");
        var context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        Triangle triangle = (Triangle) context.getBean("triangle");

        triangle.draw();
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
