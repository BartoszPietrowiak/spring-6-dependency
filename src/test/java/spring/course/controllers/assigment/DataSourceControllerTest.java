package spring.course.controllers.assigment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("default")
class DataSourceControllerTest {

    @Autowired
    DataSourceController dataSourceController;

    @Test
    void getDataSource() {
        System.out.println(dataSourceController.getDataSource());
    }
}