package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Configuration
@Import({SpringDataConfig.class})
@EnableWebMvc
@ComponentScan({"controllers", "services.impl"})
public class MvcConfig {
}
