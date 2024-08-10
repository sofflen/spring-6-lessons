package com.study.spring6lessons.controllers.environment;

import com.study.spring6lessons.services.environment.DataSourceService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final DataSourceService dataSourceService;

    public EnvironmentController(DataSourceService dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource() {
        return dataSourceService.getDataSource();
    }
}
