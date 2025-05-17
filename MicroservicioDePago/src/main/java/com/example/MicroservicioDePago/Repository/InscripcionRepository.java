package com.example.MicroservicioDePago.Repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MicroservicioDePago.Model.Entities.Inscripcion;

@Repository
public interface InscripcionRepository extends JpaRepository<Inscripcion, Integer> {


    List<Inscripcion> findByUsuarioId(String usuarioId);

    List<Inscripcion> findByCursoId(String cursoId);

}

    

