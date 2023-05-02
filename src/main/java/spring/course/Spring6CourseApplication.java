package spring.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.course.controllers.MyController;

@SpringBootApplication
public class Spring6CourseApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6CourseApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);

		System.out.println(controller.sayHello());
	}

}
