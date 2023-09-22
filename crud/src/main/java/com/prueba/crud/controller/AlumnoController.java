package com.prueba.crud.controller;

import com.prueba.crud.model.Alumno;
import com.prueba.crud.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumno")
@CrossOrigin(origins = {"http://localhost:4200", "http://localhost:8080"})

public class AlumnoController {
    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/nuevo")
    public Alumno newAlumno(@RequestBody Alumno newAlumno){
        return this.alumnoService.newAlumno(newAlumno);
    }

    @GetMapping("/mostrar")
    public Iterable<Alumno> getAll(){
        return alumnoService.getAll();

    }

    @PostMapping("/update")
    public Alumno updateAlumno(@RequestBody Alumno alumno){
        return this.alumnoService.modifyAlumno(alumno);
    }

    @PostMapping("/{id}")
    public Boolean deletePersona(@PathVariable(value = "id") Long id){
        return this.alumnoService.deleteAlumno(id);
    }
}
