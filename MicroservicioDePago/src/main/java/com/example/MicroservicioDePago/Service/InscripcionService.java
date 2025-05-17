package com.example.MicroservicioDePago.Service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MicroservicioDePago.Model.Entities.Inscripcion;
import com.example.MicroservicioDePago.Repository.InscripcionRepository;

@Service
public class InscripcionService {
    
    @Autowired
    private InscripcionRepository inscripcionRepository;

    public Inscripcion crearInscripcion(String idUsuario, String idCurso, Date fecha_inscripcion) {
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setIdUsuario(idUsuario);
        inscripcion.setIdCurso(idCurso);
        inscripcion.setFechaInscripcion(fecha_inscripcion);

        return inscripcionRepository.save(inscripcion);
    }
}
