package org.example.services;

import org.example.config.ProjectConfig;
import org.example.models.User;
import org.example.services.LogService;
import org.example.repositories.UserRepository;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final LogService logService;


    public UserService(UserRepository userRepository, LogService logService) {
        this.userRepository = userRepository;
        this.logService = logService;
    }

@ProjectConfig.toLog
    public User saveUser(User user) {
        this.logService.print();
        System.out.println("Ricevendo l'utente " + user.getUsername());
        String username = user.getUsername().toUpperCase();
        user.setUsername(username);
        List<User> users = this.userRepository.getUsers();
        for (User x : users) {
            if (x.getEmail().equals(user.getEmail())) {
                throw new IllegalArgumentException("Utente già presente");
            }
        }
        return this.userRepository.saveUser(user);
    }
}
