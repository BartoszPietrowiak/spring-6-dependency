package spring.course.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import spring.course.services.GreetingService;
import spring.course.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class SetterInjectedControllerTest {

    @Autowired
    SetterInjectedController setterInjectedController;

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}