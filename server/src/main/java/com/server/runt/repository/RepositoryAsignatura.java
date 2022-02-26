package com.server.runt.repository;

import com.server.runt.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAsignatura extends JpaRepository<Asignatura, Long> {
}
