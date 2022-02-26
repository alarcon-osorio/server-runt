package com.server.runt.service;

import com.server.runt.entity.Estudiante;
import com.server.runt.repository.RepositoryEstudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEstudiante {

    @Autowired
    RepositoryEstudiante repositoryEstudiante;

    public List<Estudiante> getDataEstudiante(){
        return repositoryEstudiante.findAll();
    }
}
