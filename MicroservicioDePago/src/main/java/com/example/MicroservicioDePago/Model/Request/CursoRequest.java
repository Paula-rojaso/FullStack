package com.example.MicroservicioDePago.Model.Request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
public class CursoRequest {

    @NotBlank
    private String id;
    private String nombre;
    private double valor;
}
