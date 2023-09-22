package com.prueba.crud.service;

import com.prueba.crud.model.Alumno;
import com.prueba.crud.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlumnoServiceImpl implements AlumnoService {
    @Autowired
    private AlumnoRepository alumnoRepository;

    @Override
    public Alumno newAlumno(Alumno newAlumno) {
        return alumnoRepository.save(newAlumno);
    }

    @Override
    public Iterable<Alumno> getAll() {
        return this.alumnoRepository.findAll();
    }

    @Override
    public Alumno modifyAlumno(Alumno alumno) {
        Optional<Alumno> alumnoEncontrado = this.alumnoRepository.findById(alumno.getNumDocumento());
        if (alumnoEncontrado.get() != null){
            alumnoEncontrado.get().setNombre(alumno.getNombre());
            alumnoEncontrado.get().setApellido(alumno.getApellido());
            alumnoEncontrado.get().setCorreoElectronico(alumno.getCorreoElectronico());
            return this.newAlumno(alumnoEncontrado.get());
        }
        return null;
    }

    @Override
    public Boolean deleteAlumno(Long idAlumno) {
        this.alumnoRepository.deleteById(idAlumno);
        return true;
    }
}
