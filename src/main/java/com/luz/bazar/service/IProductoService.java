package com.luz.bazar.service;

import com.luz.bazar.model.Producto;
import java.util.List;


public interface IProductoService {
    
    //Declarar los métodos sin implementarlos 
    
    //Lista completa de productos GET
    public List<Producto> getProductos();
    
    //Creación de producto POST
    public void saveProducto(Producto producto);
   
    //Editar Producto
    public void editProducto(Producto producto);
    
  
    //Traer producto en particular
    public Producto traerProducto(Long codigo_producto);
    
    //Eliminar producto byId
    public void deleteProducto(Long codigo_producto);
    
    
    //4 Lista de productos cuya cantidad_disponible 
    //sea menor a 5
    public List<Producto> faltaStock();
        
   
    
    
}
