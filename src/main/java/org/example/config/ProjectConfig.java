package org.example.config;

import org.example.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"org.example.services", "org.example.repositories", "org.example" +
        ".aspects"})
public class ProjectConfig {

//    @Bean
//    public UserService userService(){
//        return new UserService();
//    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface toLog{
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface toTrim{
    }

}
