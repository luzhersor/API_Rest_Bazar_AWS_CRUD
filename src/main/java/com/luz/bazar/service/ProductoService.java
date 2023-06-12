
package com.luz.bazar.service;

import com.luz.bazar.model.Producto;
import com.luz.bazar.repository.IProductoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService{
    
    //Inyectar dependecias
    //Declarando la variable sin inicializarla
    @Autowired
    private IProductoRepository productoRepo;

    
    @Override
    public List<Producto> getProductos() {
        return productoRepo.findAll();
    }

    @Override
    public void saveProducto(Producto producto) {
        productoRepo.save(producto);
    }

    @Override
    public void editProducto(Producto producto) {
        this.saveProducto(producto);
    }

    @Override
    public Producto traerProducto(Long codigo_producto) {
        Producto product = productoRepo.findById(codigo_producto).orElse(null);
        //return productoRepo.findById(codigo_producto).orElse(null);
        return product;
    }

    @Override
    public void deleteProducto(Long codigo_producto) {
        productoRepo.deleteById(codigo_producto);
    }

    @Override
    public List<Producto> faltaStock() {
        
        List<Producto> listaProductos = this.getProductos();
        List<Producto> listaFaltaStock = new ArrayList<Producto>();
        
        for (Producto prod:listaProductos){
            if(prod.getCantidad_disponible()<= 5){
                listaFaltaStock.add(prod);
            }
        }
        
        return listaFaltaStock;
        
    }
    
    
    
}
