package com.ecommerce.service;


import com.ecommerce.model.Orden;

import java.util.List;

public interface IOrdenService {
    Orden save(Orden orden);
    List<Orden> findAll();
    String generarNumeroOrden();


}
