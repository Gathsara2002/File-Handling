package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Gathsara
 * created : 10/16/2023 -- 8:59 PM
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.spring.controller", "lk.ijse.spring.advisor"})
public class WebAppConfig {
    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(900000000);
        return multipartResolver;
    }
}
