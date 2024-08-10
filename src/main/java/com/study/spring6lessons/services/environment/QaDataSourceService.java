package com.study.spring6lessons.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class QaDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "QA DataSource";
    }
}
