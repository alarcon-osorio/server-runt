package com.server.runt.repository;

import com.server.runt.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEstudiante extends JpaRepository<Estudiante, Long> {
}
