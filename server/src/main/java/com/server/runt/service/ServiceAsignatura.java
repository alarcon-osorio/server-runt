package com.server.runt.service;

import com.server.runt.entity.Asignatura;
import com.server.runt.repository.RepositoryAsignatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAsignatura {

    @Autowired
    RepositoryAsignatura repositoryAsignatura;

    public List<Asignatura> getDataAsignatura(){
        return repositoryAsignatura.findAll();
    }
}
