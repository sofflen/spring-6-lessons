package com.study.spring6lessons.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV","default"})
@Service
public class DevDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "dev data source";
    }
}
