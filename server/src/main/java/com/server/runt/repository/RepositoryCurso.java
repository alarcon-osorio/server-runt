package com.server.runt.repository;

import com.server.runt.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryCurso extends JpaRepository<Curso, Long> {
}
