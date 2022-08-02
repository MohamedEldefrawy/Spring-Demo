package com.example.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

    public static void main(String[] args) {
//        Triangle triangle = (Triangle) new XmlBeanFactory(new ClassPathResource("spring.xml")).getBean("triangle");
//        var context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) new ClassPathXmlApplicationContext("spring.xml").getBean("triangle");

        triangle.draw();
        SpringApplication.run(SpringDemoApplication.class, args);
    }

}
