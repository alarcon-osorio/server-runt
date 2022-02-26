package com.server.runt.repository;

import com.server.runt.entity.Colegio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryColegio extends JpaRepository<Colegio, Long> {
}
