package spring.course.services.assigment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("dataSourceService")
@Profile("prod")
public class DataSourceProdServiceImpl implements DataSourceService {
    @Override
    public String getDataSource() {
        return "prod";
    }
}
