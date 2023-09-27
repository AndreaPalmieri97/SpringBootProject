package org.example.repositories;

import org.example.models.ToDo;
import org.example.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class ToDoRepository {

    public ToDoRepository(){
    }

    public void saveToDo(ToDo toDo){
        System.out.println("Salvando nel database... " +toDo.getTodo());
    }
}
