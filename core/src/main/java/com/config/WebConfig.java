package com.config;

import com.wire.NumberGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("com.*")
public class WebConfig {

    @Bean
    public NumberGenerator numberGenerator() {
        NumberGenerator numberGenerator = new NumberGenerator();
        return numberGenerator;
    }
}
