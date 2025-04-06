package com.reservasala.usuario_service.domain.model.valor;

import lombok.Value;

@Value
public class Endereco {
    String rua;
    String numero;
    String cidade;
}