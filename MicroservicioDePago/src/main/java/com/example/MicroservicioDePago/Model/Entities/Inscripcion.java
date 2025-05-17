package com.example.MicroservicioDePago.Model.Entities;

import java.sql.Date;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "inscripciones")
public class Inscripcion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscripcion")
    private int id_inscripcion;

    @Column(name = "id_usuario", nullable = false)
    private String IdUsuario;  

    @Column(name = "id_curso", nullable = false)
    private String IdCurso;    

    @Column(name = "fecha_inscripcion", nullable = false)
    private Date fechaInscripcion;
}