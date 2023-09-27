package org.example.repositories;

import org.example.controllers.UserController;
import org.example.models.User;
import org.example.services.UserService;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();
    public UserRepository(){
    }

    public User saveUser(User user){
        System.out.println("Salvando nel db " + user.getUsername());
        this.users.add(user);
        return user;

    }


    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
