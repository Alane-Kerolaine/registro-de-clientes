package com.loja.registrodeclientes.Controller;

import com.loja.registrodeclientes.Model.ClienteModel;
import com.loja.registrodeclientes.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping("/cadastrar-cliente")
    public ClienteModel cadastrarCliente(@RequestBody ClienteModel cliente){
        clienteService.cadastrarCliente(cliente);
        return cliente;
    }

    @GetMapping("/buscar-cliente")
    public Optional<ClienteModel> buscarPorId(@RequestParam long id){
        return clienteService.buscarPorId(id);
    }

    @PostMapping("/alterar-dados-cliente")
    public ClienteModel alterarDados(@RequestBody ClienteModel cliente){
        clienteService.alterarDados(cliente);
        return cliente;
    }

}
