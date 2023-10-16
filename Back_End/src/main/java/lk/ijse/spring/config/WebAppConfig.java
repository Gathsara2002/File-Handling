package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Gathsara
 * created : 10/16/2023 -- 8:59 PM
 **/

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.spring"})
public class WebAppConfig {
}
