package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Configuration
@Import({SpringDataConfig.class})
//@ImportResource({"/WEB-INF/advancedxmlconfig/advanced-xml-config.xml"})
@EnableWebMvc
@ComponentScan({"controllers", "services.impl"}) // be specific, avoid loading non web layer beans
public class MvcConfig {

//    View resolver
//    Allows you to specify the suffix and prefix of a jsp name,
//    therefore you only need to state the actual name of the jsp
//    when you are returning the view name

    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setSuffix(".jsp");
        viewResolver.setPrefix("/WEB-INF/jsp/");

        return viewResolver;
    }
}
