package com.teksystems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf().disable()
                // this line is saying anything with the URL /employee/** is going require authentication
                // you can put any number of URLS that you want to secure here with a comma sepearting them,
                .authorizeHttpRequests().requestMatchers("/event/**").authenticated()
                // everything else in the application is going to permitted
                .anyRequest().permitAll()
                .and()
                .formLogin()
                // this is the URL to the login page
                // the request method for this is implemented in the login controller
                // to display the login.jsp view
                .loginPage("/login/loginPage")
                // this is the URL that the login page will submit to with a action="/user/loginpost" method="POST"
                // this controller method is implemented by spring security and you dont have to do anything to use it
                // other than set the method to post and set the action to this URL
                .loginProcessingUrl("/login/loginpost")
                // this URL is where spring security will send the user IF they have not requested a secure URL
                // if they have requested a secure URL spring security will ignore this and send them to the
                // secured url they requested
                .defaultSuccessUrl("/")
                .and()
                .logout()
                .invalidateHttpSession(true)
                .logoutUrl("/login/logout")
                .logoutSuccessUrl("/index");


        return http.build();
    }


    @Bean(name = "passwordEncoder")
    public PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        return authConfig.getAuthenticationManager();
    }

}
