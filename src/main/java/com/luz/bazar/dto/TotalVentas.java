
package com.luz.bazar.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class TotalVentas {
    
    private LocalDate fechaVenta;
    
    private Double montoTotal;
    
    private Integer cantidadVentas;
    
}
