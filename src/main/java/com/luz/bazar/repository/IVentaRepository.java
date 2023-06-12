
package com.luz.bazar.repository;

import com.luz.bazar.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long> {
    
}
