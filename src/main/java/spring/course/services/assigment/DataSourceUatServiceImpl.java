package spring.course.services.assigment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("dataSourceService")
@Profile("uat")
public class DataSourceUatServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "uat";
    }
}
