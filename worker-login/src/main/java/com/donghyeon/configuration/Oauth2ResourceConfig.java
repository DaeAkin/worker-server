package com.donghyeon.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

@EnableResourceServer
@Configuration
public class Oauth2ResourceConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
        super.configure(resources);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.
                csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/**").permitAll()
                .antMatchers(HttpMethod.POST, "/**").permitAll();
//                .antMatchers(HttpMethod.POST,"/api/users").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/users/auth_sms").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/users/certified_sms").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/users/id").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/users/pw").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/payments").permitAll()
//                .antMatchers(HttpMethod.POST, "/api/payments/verify").permitAll()
//                .antMatchers(HttpMethod.GET, "/api/payments/*/link").permitAll()
//                .antMatchers(HttpMethod.GET, "/lib/jquery/**").permitAll()
//                .antMatchers(HttpMethod.GET, "/favicon.ico").permitAll()
//                .anyRequest().access("#oauth2.hasScope('USER')");
    }
}
