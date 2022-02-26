package com.server.runt.repository;

import com.server.runt.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryProfesor  extends JpaRepository<Profesor, Long> {

    @Query(value = "select t1.nombre " +
            "from profesor t1 " +
            "left join asignatura t2 on t1.id_profesor = t2.id_profesor " +
            "where t1.id_profesor = ?1", nativeQuery = true)
    List<Profesor> findByIdQuery(long id_profesor);

}
