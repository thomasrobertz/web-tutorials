package com.laurentiuspilca.springsecurity.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfiguration extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public UserDetailsService userDetailService() {
        var manager = new InMemoryUserDetailsManager();

        UserDetails exampleUser = User.withUsername("Bill")
                .password("12345")
                .roles("ADMIN")
                .authorities("write")
                .build();

        UserDetails anotherUser = User.withUsername("John")
                .password("12345")
                .roles("MANAGER")
                .authorities("read")
                .build();

        manager.createUser(exampleUser);
        manager.createUser(anotherUser);

        return manager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // We still get 403 will revisit later
        http.authorizeRequests()
                .antMatchers("/hello")
                    .access("hasAnyRole('ADMIN')")
        .anyRequest().permitAll();
    }
}
