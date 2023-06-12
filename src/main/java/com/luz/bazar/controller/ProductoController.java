
package com.luz.bazar.controller;

import com.luz.bazar.model.Producto;
import com.luz.bazar.service.ProductoService;
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
public class ProductoController {
    
    //Inyectar dependecias de Service
    @Autowired
    private ProductoService productoServ;
        
    //1 Creación de producto
    @PostMapping("/productos/crear")
    public String crearProducto(@RequestBody Producto producto){
        productoServ.saveProducto(producto);
        return "Producto guardado exitosamente " + producto.toString();
    }
    
    //2 Obtener lista completa de productos
    @GetMapping("/productos/traer")
    public List<Producto> getProductos(){
        return productoServ.getProductos();
    }
    
    //3 Traer un producto en particular 
    @GetMapping("/productos/{codigo_producto}")
    public Producto findProducto(@PathVariable Long codigo_producto){
        return productoServ.traerProducto(codigo_producto);
    }
    
    //4 Eiminación
    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public String deleteProducto(@PathVariable Long codigo_producto){
        productoServ.deleteProducto(codigo_producto);
        return "Producto eliminado exitosamente";
    }
    
    //5 Edición
    @PutMapping("/productos/editar")
    public String editProducto(@RequestBody Producto producto){
        productoServ.editProducto(producto);
        return "Producto editado exitosamente "+ productoServ.traerProducto(producto.getCodigo_producto()) + producto.toString();
    }
    
    
    //6 Productos cuya cantidad es menor a 5
    @GetMapping("/productos/falta_stock")
    public List<Producto> faltaStock(){
        return productoServ.faltaStock();
    }
    
}
