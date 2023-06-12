
package com.luz.bazar.service;

import com.luz.bazar.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    public void saveCliente(Cliente cliente);
    
    public List<Cliente> getClientes();
    
    public Cliente findCliente(Long id_cliente);
    
    public void deleteCliente(Long id_cliente);
    
    public void editCliente(Cliente cliente);
}
