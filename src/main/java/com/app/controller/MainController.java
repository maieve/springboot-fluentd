package com.app.controller;

import com.app.config.FluentdConfig;
import org.fluentd.logger.FluentLogger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    private  FluentLogger LOG = FluentLogger.getLogger(FluentdConfig.fluentdTag, FluentdConfig.fluentdHost,FluentdConfig.fluentdPort);

    @GetMapping("")
    public String index(){

        Map<String, Object> data = new HashMap<>();
        data.put("from", "userA");
        data.put("to", "userB");
        int count = 1;
        for (int i=0; i<count; i++){
            data.put("num", i+"");
            LOG.log("follow", data);
        }
        return "test";
    }
}
