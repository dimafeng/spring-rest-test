package ru.dimafeng.springresttest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "ru.dimafeng.springresttest",
               excludeFilters = {@ComponentScan.Filter(Controller.class)})
public class AppConfig {
}
