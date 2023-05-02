package spring.course.services.assigment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("dataSourceService")
@Profile({"dev","default"})
public class DataSourceDevServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "dev";
    }
}
