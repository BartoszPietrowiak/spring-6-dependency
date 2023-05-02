package spring.course.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingInjection")
public class GreetingServiceSetterInjection implements GreetingService {

    @Override
    public String sayGreeting() {
        return "I'm sending greetings";
    }
}
