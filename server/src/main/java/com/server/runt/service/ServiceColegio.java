package com.server.runt.service;

import com.server.runt.entity.Colegio;
import com.server.runt.repository.RepositoryColegio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceColegio {

    @Autowired
    RepositoryColegio repositoryColegio;

    public List<Colegio> finDataColegio(){
        return repositoryColegio.findAll();
    }

}
