package com.prueba.crud.repository;

import com.prueba.crud.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

}
