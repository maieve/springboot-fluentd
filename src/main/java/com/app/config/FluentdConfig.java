package com.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FluentdConfig {

    public static String fluentdHost;

    public static int fluentdPort;

    public static String fluentdTag;

    @Value("${fluentd.host:127.0.0.0}")
    public void setHost(String host) {
        fluentdHost = host;
    }

    @Value("${fluentd.port:24224}")
    public void setPort(int port) {
        fluentdPort = port;
    }

    @Value("${fluentd.tag:fluentd.test}")
    public void setTag(String tag) {
        fluentdTag = tag;
    }

}
