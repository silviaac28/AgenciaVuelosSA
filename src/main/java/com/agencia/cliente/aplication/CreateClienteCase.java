package com.agencia.cliente.aplication;

import com.agencia.cliente.domain.entity.Cliente;
import com.agencia.cliente.domain.service.ClienteService;

public class CreateClienteCase {
    private final ClienteService clienteService;

    public CreateClienteCase(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    public void execute(Cliente clientes) {

        clienteService.createCliente(clientes);
    }

}