package spring.course.controllers.i18n;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import spring.course.services.GreetingService;

@Controller
public class Myi18NController {

    private final GreetingService greetingService;

    public Myi18NController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
