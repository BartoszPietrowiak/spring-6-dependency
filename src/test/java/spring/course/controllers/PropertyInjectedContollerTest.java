package spring.course.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.course.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjectedContollerTest {

    @Autowired
    PropertyInjectedContoller propertyInjectedContoller;

//    @BeforeEach
//    void setUp() {
//        propertyInjectedContoller = new PropertyInjectedContoller();
//        propertyInjectedContoller.greetingService = new GreetingServiceImpl();
//    }

    @Test
    void sayHello() {
        System.out.println(propertyInjectedContoller.sayHello());
    }
}