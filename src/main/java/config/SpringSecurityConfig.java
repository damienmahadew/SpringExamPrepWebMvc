package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

/**
 * Created by DAMIEN6 on 23/10/2016.
 */
@Configuration  //see web.xml for more configuration!
//@EnableWebMvcSecurity  //-- this is deprecated?? TODO- find out about this
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
//@EnableGlobalMethodSecurity(prePostEnabled = true) -- enables SpEL -- see services.UserService
public class SpringSecurityConfig  extends WebSecurityConfigurerAdapter {

//    Web specific security settings
    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        First match is used, therefore put specific matchers first
        http.authorizeRequests()
                .antMatchers("/css/**", "/images/**", "/javascript/**").permitAll()
                .antMatchers("/user/deleteAll").hasRole("ADMIN")
                .antMatchers("/user/**").hasRole("USER")
//                Other types of matchers
//                .antMatchers("/user/**").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/user/**").authenticated()
//                .antMatchers("/user/**").fullyAuthenticated()
//                .antMatchers("/user/**").anonymous()
                //specifying login and logout
                .and()
                .formLogin()
                .loginPage("/login") //this is not needed. Only if you want to override the default login page.
                //if you have the .loginPage("..") then you need to add a controller to return the login page
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/") // same as loginPage
                .permitAll();

    }

//    General security settings - authentication manager etc..
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()   // Adds a UserDetailsManagerConfigurer
//                .ldapAuthentication()     //LDAP integration
//                .jdbcAuthentication().dataSource(dataSource)     //JDBC integration, need to autowire datasource
//                Can customize queries using methods - usersByUsernameQuery, authoritiesByUsernameQuery, groupAuthoritiesByUsername()
//                See SpringSecurity.java for info on how to setup tables for JDBC
//                .passwordEncoder(new StandardPasswordEncoder()) SHA 256 encoding
//                .passwordEncoder(new StandardPasswordEncoder("sodium-chloride)) -- secure passwords with well known string - known as a 'salt'
                .withUser("admin").password("admin").roles("USER", "ADMIN")
                .and()
                .withUser("user").password("user").roles("USER");
    }


}
