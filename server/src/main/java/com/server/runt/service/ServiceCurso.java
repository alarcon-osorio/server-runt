package com.server.runt.service;

import com.server.runt.entity.Curso;
import com.server.runt.repository.RepositoryCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceCurso {

    @Autowired
    RepositoryCurso repositoryCurso;

    public List<Curso> getDataCurso(){
        return repositoryCurso.findAll();
    }
}
