package com.loja.registrodeclientes.Service;

import com.loja.registrodeclientes.Model.ClienteModel;
import com.loja.registrodeclientes.Repository.Cliente_Repository;
import com.loja.registrodeclientes.data.DetalheClienteData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DetalheClienteServiceImpl implements UserDetailsService {

    @Autowired
    Cliente_Repository clienteRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<ClienteModel> cliente = clienteRepository.findByLogin(username);
        if(cliente.isEmpty()){
            throw new UsernameNotFoundException("Cliente [" + username + "] não encontrado");
        }

        return new DetalheClienteData(cliente);
    }
}
