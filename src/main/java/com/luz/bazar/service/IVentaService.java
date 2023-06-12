
package com.luz.bazar.service;

import com.luz.bazar.dto.TotalVentas;
import com.luz.bazar.model.Producto;
import com.luz.bazar.model.Venta;
import java.time.LocalDate;
import java.util.List;


public interface IVentaService {
    
    //Declarar los métodos sin implementarlos
    public void saveVenta(Venta venta);
    
    public List<Venta> getVentas();
    
    public Venta findVenta(Long codigo_venta);

    public void deleteVenta(Long codigo_venta);
    
    public void editVenta(Venta venta);
    
    //5 Lista de productos de una determinada venta
    public List<Producto> ProductosVenta(Long codigo_venta);

    //6 Sumatoria del monto y también cantidad total 
    //de ventas de un determinado día GET CONSTRUCCIÓN
    //public TotalVentas fecha_venta(String fecha);
}
