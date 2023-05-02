package spring.course.services.assigment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("dataSourceService")
@Profile("qa")
public class DataSourceQaServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "qa";
    }
}
