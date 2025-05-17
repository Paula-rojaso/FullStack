package com.example.MicroservicioDePago.Service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MicroservicioDePago.Model.Entities.Cupon;
import com.example.MicroservicioDePago.Model.Entities.Inscripcion;
import com.example.MicroservicioDePago.Model.Entities.Pago;
import com.example.MicroservicioDePago.Repository.PagoRepository;

@Service
public class PagoService {
    
    @Autowired
    private PagoRepository pagoRepository;

    public Pago guardarPago(int id_pago, Double monto, Date fecha_pago, Cupon cupon, Inscripcion inscripcion) {
        Pago pago = new Pago();
        pago.setId_Pago(id_pago);
        pago.setMonto(monto);
        pago.setFechaPago(fecha_pago);
        pago.setCupon(cupon);
        pago.setId_inscripcion(inscripcion);
        return pagoRepository.save(pago);
    }
    
}
