package spring.course.services.i18n;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spring.course.services.GreetingService;
@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
