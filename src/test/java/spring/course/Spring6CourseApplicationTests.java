package spring.course;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import spring.course.controllers.MyController;

@SpringBootTest
class Spring6CourseApplicationTests {

	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	MyController myController;

	@Test
	void testAutowiredOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromContext() {
		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
