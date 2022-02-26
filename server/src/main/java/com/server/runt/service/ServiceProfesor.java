package com.server.runt.service;

import com.server.runt.entity.Profesor;
import com.server.runt.repository.RepositoryProfesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProfesor {

    @Autowired
    RepositoryProfesor repositoryProfesor;

    public List<Profesor> getDataProfesor(){
        return repositoryProfesor.findAll();
    }

    public Profesor getDataProfesorById(long id_profesor){
        return repositoryProfesor.findById(id_profesor).get();
    }
}
