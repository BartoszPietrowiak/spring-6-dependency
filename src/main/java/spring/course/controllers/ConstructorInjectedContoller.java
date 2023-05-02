package spring.course.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.course.services.GreetingService;

@Controller
public class ConstructorInjectedContoller {

    private final GreetingService greetingService;

    public ConstructorInjectedContoller(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
