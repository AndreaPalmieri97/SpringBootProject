package org.example.services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class LogService {

    public LogService(){
        System.out.println("Inizializzazione");
    }

    public void print(){
        System.out.println("Ciao");
    }
}
