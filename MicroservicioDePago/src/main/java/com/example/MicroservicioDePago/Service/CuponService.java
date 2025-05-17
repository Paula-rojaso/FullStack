package com.example.MicroservicioDePago.Service;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.MicroservicioDePago.Model.Entities.Cupon;
import com.example.MicroservicioDePago.Repository.CuponRepository;



@Service
public class CuponService {

    @Autowired
    private CuponRepository cuponRepository;

    public Cupon validarYObtenerCupon(String codigoCupon) {
        Cupon cupon = cuponRepository.findByCodigo(codigoCupon);

        if (cupon == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cupón no encontrado");
        }

        if (!cupon.isActivo()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cupón no está activo");
        }

        if (cupon.getFechaExpiracion() != null &&
            cupon.getFechaExpiracion().toLocalDate().isBefore(LocalDate.now())) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cupón expirado");
        }
        return cupon;
    }


  
}
