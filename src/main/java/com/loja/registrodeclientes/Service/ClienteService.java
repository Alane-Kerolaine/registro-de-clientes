package com.loja.registrodeclientes.Service;

import com.loja.registrodeclientes.Model.ClienteModel;
import com.loja.registrodeclientes.Repository.Cliente_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    Cliente_Repository clienteRepository;

    public ClienteModel cadastrarCliente(ClienteModel cliente){
        clienteRepository.save(cliente);
        return cliente;
    }

    public Optional<ClienteModel> buscarPorId(long id){
        return clienteRepository.findById(id);
    }

        public ClienteModel alterarDados(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }

}
