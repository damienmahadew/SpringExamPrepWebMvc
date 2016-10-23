package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by DAMIEN6 on 22/10/2016.
 */
@Configuration
@Import({SpringSecurityConfig.class})
public class RootConfig {
}
