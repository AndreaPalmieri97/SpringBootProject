package org.example;

import org.example.config.ProjectConfig;
import org.example.models.ToDo;
import org.example.models.User;
import org.example.services.ToDoService;
import org.example.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

//        User utente = new User();
//        utente.setId(0L);
//        utente.setUsername("Palmers");
//        utente.setPassword("ciao123");
//        utente.setEmail("ciao@email.com");
//
//        ToDo toDo = new ToDo();
//        toDo.setUser(utente);
//        toDo.setTodo("Saluta");
//        toDo.setExpiryDate("2023-09-27");
//        toDo.setCreateDate("2023-09-27");
//        toDo.setModifieData("2023-09-27");
//
//        ApplicationContext context =  new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        //UserService userService = context.getBean("userService", UserService.class);
//        UserService userService = context.getBean(UserService.class);
//        ToDoService toDoService = context.getBean(ToDoService.class);
//
////        UserService userService = new UserService();
//        userService.saveUser(utente);
//        toDoService.saveToDo(toDo);



    }
}