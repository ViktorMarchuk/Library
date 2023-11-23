package com.vm.library.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ConfigDataDB {
    @Value("${db.url}")
    private String url;
    @Value("${db.userName}")
    private String userName;
    @Value("${db.password}")
    private String password;
    @Value("${db.driver}")
    private String driver;
}
