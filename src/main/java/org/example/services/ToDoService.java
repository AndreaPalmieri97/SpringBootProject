package org.example.services;

import org.example.config.ProjectConfig;
import org.example.models.ToDo;
import org.example.repositories.ToDoRepository;
import org.example.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class ToDoService{

    private final ToDoRepository toDoRepository;
    private final LogService logService;

    public ToDoService(ToDoRepository toDoRepository, LogService logService){
        this.toDoRepository = toDoRepository;
        this.logService = logService;
    }
//    @ProjectConfig.toLog
//    public void saveToDo(ToDo toDo){
//        this.logService.print();
//        System.out.println("Ricevendo il todo " + toDo.getTodo());
//        String nameToDo = toDo.getTodo().toUpperCase();
//        toDo.setTodo(nameToDo);
//        this.toDoRepository.saveToDo(toDo);
//    }

    @ProjectConfig.toTrim
    public void saveToDo (ToDo toDoModel){
        this.logService.print();
        System.out.println("Ricevendo il todo..."+toDoModel.getTodo());
        String nomeToDo = toDoModel.getTodo().toUpperCase();
        toDoModel.setTodo(nomeToDo);
        this.toDoRepository.saveToDo(toDoModel);
    }
}
