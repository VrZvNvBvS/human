package com.nguyen.human;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override // usually done by right-click override intellij
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HumanApplication.class);
    }

}