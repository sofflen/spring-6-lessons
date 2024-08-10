package com.study.spring6lessons.controllers.environment;

import com.study.spring6lessons.services.environment.DataSourceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevEnvironmentControllerTest {

    @Autowired
    DataSourceService dataSourceService;

    @Test
    void getDataSource() {
        System.out.println(dataSourceService.getDataSource());
    }
}
