package com.study.spring6lessons.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class UatDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "UAT DataSource";
    }
}
