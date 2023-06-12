
package com.luz.bazar.service;

import com.luz.bazar.dto.TotalVentas;
import com.luz.bazar.model.Producto;
import com.luz.bazar.model.Venta;
import com.luz.bazar.repository.IVentaRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    
    //Inyección de dependecia Repository
    @Autowired
    private IVentaRepository ventaRepo;

    @Override
    public void saveVenta(Venta venta) {
        ventaRepo.save(venta);
    }

    @Override
    public List<Venta> getVentas() {
        return ventaRepo.findAll();
    }

    @Override
    public Venta findVenta(Long codigo_venta) {
        return ventaRepo.findById(codigo_venta).orElse(null);
    }

    @Override
    public void deleteVenta(Long codigo_venta) {
        ventaRepo.deleteById(codigo_venta);
    }

    @Override
    public void editVenta(Venta venta) {
        this.saveVenta(venta);
    }

    //5 Lista de productos de una determinada venta
    @Override
    public List<Producto> ProductosVenta(Long codigo_venta) {
        
        Venta venta = ventaRepo.findById(codigo_venta).orElse(null);
        return venta.getListaProductos();
    }

    /*EN CONTRUCCIÓN
    @Override
    public TotalVentas fecha_venta(String fecha) {
        
         LocalDate fecha_venta = LocalDate.parse(fecha);
         
         List<Venta> listaVentas = this.getVentas();
         List<Venta> listaVent_fecha = ventaRepo.find
                 
         int cantidad_ventas = 0;
         double montoTotal = 0;
         
         for (Venta venta:listaVent_fecha){
             cantidad_ventas++;
             montoTotal += venta.getTotal();
         }
         */
           
    
    
    
}
