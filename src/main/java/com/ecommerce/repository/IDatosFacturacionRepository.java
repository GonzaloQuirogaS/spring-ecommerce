package com.ecommerce.repository;

import com.ecommerce.model.DatosFacturacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDatosFacturacionRepository extends JpaRepository<DatosFacturacion, Integer> {
}
