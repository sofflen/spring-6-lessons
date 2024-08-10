package com.study.spring6lessons.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service
public class ProdDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "Prod DataSource";
    }
}
