package spring.course.controllers.assigment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.course.services.assigment.DataSourceService;

@Controller
public class DataSourceController {

    private final DataSourceService dataSourceService;

    public DataSourceController(@Qualifier("dataSourceService") DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource() {
        return dataSourceService.getDataSource();
    }
}
