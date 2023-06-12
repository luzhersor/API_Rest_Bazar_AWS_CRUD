
package com.luz.bazar.controller;

import com.luz.bazar.model.Cliente;
import com.luz.bazar.service.ClienteService;
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
public class ClienteController {
    
    //Inyección de dependencia Service
    @Autowired
    private ClienteService clienteServ;
    
    //1 Creación Cliente
    @PostMapping("/clientes/crear")
    public String saveCliente(@RequestBody Cliente cliente){
        clienteServ.saveCliente(cliente);
        return "Cliente guardado exitosamente";
    }
    
    //2 Lista completa de Clientes 
    @GetMapping("/clientes/traer")
    public List<Cliente> getClientes(){
        return clienteServ.getClientes();
    }
    
    //3 Traer un cliente en particular
    @GetMapping("/clientes/{id_cliente}")
    public Cliente findCliente(@PathVariable Long id_cliente){
        return clienteServ.findCliente(id_cliente);
    }
    
    //4 Eliminación de un cliente en particular
    @DeleteMapping("/clientes/eliminar/{id_cliente}")
    public String deleteCliente(@PathVariable Long id_cliente){
        clienteServ.deleteCliente(id_cliente);
        return "Cliente eliminado exitosamente";
    }
    
    //5 Edición de un cliente 
    @PutMapping("/clientes/editar")
    public String editCliente(@RequestBody Cliente cliente){
        clienteServ.editCliente(cliente);
        return "Cliente editado exitosamente";
    }
    
    
    
    
    
}
