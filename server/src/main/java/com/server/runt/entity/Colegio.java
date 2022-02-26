package com.server.runt.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.IndexColumn;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "colegio")
public class Colegio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_colegio;
    private String nombre;

    @OneToMany
    @JoinColumn(name = "id_colegio")
    private List<Curso> cursos = new ArrayList<>();

    public long getId_colegio() {
        return id_colegio;
    }

    public void setId_colegio(long id_colegio) {
        this.id_colegio = id_colegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "id_colegio=" + id_colegio +
                ", nombre='" + nombre + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
