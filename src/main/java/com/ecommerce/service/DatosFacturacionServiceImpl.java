package com.ecommerce.service;

import com.ecommerce.model.DatosFacturacion;
import com.ecommerce.repository.IDatosFacturacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatosFacturacionServiceImpl implements IDatosFacturacionService {

    @Autowired
    private IDatosFacturacionRepository datosFacturacionRepository;
    @Override
    public DatosFacturacion save(DatosFacturacion datosFacturacion) {
        return datosFacturacionRepository.save(datosFacturacion);
    }
}
