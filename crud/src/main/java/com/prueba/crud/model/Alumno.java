package com.prueba.crud.model;


import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
public class Alumno {
    @Id
    @Column
    private Long numDocumento;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column
    private  String correoElectronico;

}
