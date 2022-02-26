package com.server.runt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "asignatura")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_asignatura;
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "id_profesor", insertable = false, updatable = false)
    private Profesor profesor;

    @ManyToMany(mappedBy = "asignaturas")
    private List<Estudiante> estudiantes = new ArrayList<Estudiante>();

    @ManyToOne
    @JoinTable(
            name = "asignatura_curso",
            joinColumns = @JoinColumn(name = "id_asignatura"),
            inverseJoinColumns = @JoinColumn(name = "id_curso"))
    private Curso curso;

    public long getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(long id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonIgnore
    public Profesor getProfesor() {
        return profesor;
    }

    @JsonIgnore
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @JsonIgnore
    public Curso getCurso() {
        return curso;
    }

    @JsonIgnore
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id_asignatura=" + id_asignatura +
                ", nombre='" + nombre + '\'' +
                ", profesor=" + profesor +
                ", estudiantes=" + estudiantes +
                ", curso=" + curso +
                '}';
    }
}
