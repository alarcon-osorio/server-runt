package com.server.runt.controller;

import com.server.runt.entity.*;
import com.server.runt.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="api/v1/")
@CrossOrigin("*")
public class RestControllerRunt {

    @Autowired
    ServiceColegio serviceColegio;

    @Autowired
    ServiceCurso serviceCurso;

    @Autowired
    ServiceAsignatura serviceAsignatura;

    @Autowired
    ServiceProfesor serviceProfesor;

    @Autowired
    ServiceEstudiante serviceEstudiante;

    @GetMapping("getDataColegio")
    public ResponseEntity<List<Colegio>> getDataColegio(){
        List<Colegio> dataColegio = serviceColegio.finDataColegio();
        return new ResponseEntity(dataColegio, HttpStatus.OK);
    }

    @GetMapping("getDataCurso")
    public ResponseEntity<Curso> getDataCurso(){
        List<Curso> dataCursoList = serviceCurso.getDataCurso();
        return new ResponseEntity(dataCursoList, HttpStatus.OK);
    }

    @GetMapping("getDataAsignatura")
    public ResponseEntity<Asignatura> getDataAsignatura(){
        List<Asignatura> dataAsignaturaList = serviceAsignatura.getDataAsignatura();
        return new ResponseEntity(dataAsignaturaList, HttpStatus.OK);
    }

    @GetMapping("getDataProfesor")
    public ResponseEntity<Profesor> getDataProfesores(){
        List<Profesor> dataProfesorList = serviceProfesor.getDataProfesor();
        return new ResponseEntity(dataProfesorList, HttpStatus.OK);
    }

    @GetMapping("getDataProfesor/{id_profesor}")
    public ResponseEntity<Profesor> getDataProfesor(@PathVariable("id_profesor") long id_profesor){
        Profesor dataProfesor = serviceProfesor.getDataProfesorById(id_profesor);
        return new ResponseEntity(dataProfesor, HttpStatus.OK);
    }

    @GetMapping("getDataEstudiante")
    public ResponseEntity<Estudiante> getDataEstudiante(){
        List<Estudiante> dataEstudianteList = serviceEstudiante.getDataEstudiante();
        return new ResponseEntity(dataEstudianteList, HttpStatus.OK);
    }

}
