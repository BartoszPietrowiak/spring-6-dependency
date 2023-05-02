package spring.course.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.course.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("setterGreetingInjection")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
