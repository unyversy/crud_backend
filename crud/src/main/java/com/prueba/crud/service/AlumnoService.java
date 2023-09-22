package com.prueba.crud.service;

import com.prueba.crud.model.Alumno;

public interface AlumnoService {
    Alumno newAlumno(Alumno newAlumno);
    Iterable<Alumno> getAll();

    Alumno modifyAlumno(Alumno alumno);
    Boolean deleteAlumno(Long idAlumno);
}
