package com.server.runt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_curso;
    private long grado;
    private String salon;

    @OneToMany(mappedBy = "curso",
            orphanRemoval = true,
            fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST)
    private List<Asignatura> asignaturas = new ArrayList<>();

    @JsonIgnore
    public long getId_curso() {
        return id_curso;
    }

    @JsonIgnore
    public void setId_curso(long id_curso) {
        this.id_curso = id_curso;
    }

    public long getGrado() {
        return grado;
    }

    public void setGrado(long grado) {
        this.grado = grado;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    @JsonIgnore
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    @JsonIgnore
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id_curso=" + id_curso +
                ", grado=" + grado +
                ", salon='" + salon + '\'' +
                ", asignaturas=" + asignaturas +
                '}';
    }
}