package com.ecommerce.service;


import com.ecommerce.model.Orden;
import com.ecommerce.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface IOrdenService {
    Orden save(Orden orden);

    List<Orden> findAll();

    String generarNumeroOrden();

    List<Orden> findByUsuario(Usuario usuario);


    Optional<Orden> findById(Integer id);
}
