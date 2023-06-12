package com.luz.bazar.controller;

import com.luz.bazar.model.Producto;
import com.luz.bazar.model.Venta;
import com.luz.bazar.service.VentaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {
    
    //Inyección de dependecia Service
    @Autowired
    private VentaService ventaServ;
    
    //1 Creación Venta
    //FORMATO JSON PARA INTRODUCIR LA FECHA
    //"fecha_venta": "2000-01-01"  !!IMPORTANTE
    @PostMapping("/ventas/crear")
    public String saveVenta(@RequestBody Venta venta){
        ventaServ.saveVenta(venta);
        return "Venta guardada exitosamente";
    }
    
    //2 List completa de ventas realizadas
    @GetMapping("/ventas/traer")
    public List<Venta> getVentas(){
        return ventaServ.getVentas();
    }
    
    
    //3 Traer una venta en particular
    @GetMapping("/ventas/{codigo_venta}")
    public Venta findVenta(@PathVariable Long codigo_venta){
        return ventaServ.findVenta(codigo_venta);
    }
    
    //4 Eliminar una venta
    @DeleteMapping("/ventas/eliminar/{codigo_venta}")
    public String deleteVenta(@PathVariable Long codigo_venta){
        ventaServ.deleteVenta(codigo_venta);
        return "Venta eliminada exitosamente";
    }
    
    //5 Editar una venta 
    @PutMapping("/ventas/editar")
    public String editVenta(@RequestBody Venta venta){
        ventaServ.editVenta(venta);
        return "Venta editada exitosamente";
    }
    
    //UNA MANERA DE HACERLO, LA OTRA ES LA DTO
    //5 Lista de productos de una determinada venta
    @GetMapping("/ventas/productos/{codigo_venta}")
    public List<Producto> productosVenta(@PathVariable Long codigo_venta){
        return ventaServ.ProductosVenta(codigo_venta);
    }
}
