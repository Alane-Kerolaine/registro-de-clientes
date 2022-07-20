package com.loja.registrodeclientes.Repository;

import com.loja.registrodeclientes.Model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Cliente_Repository extends JpaRepository<ClienteModel, Long> {
    List<ClienteModel> findByNome(String nome);
}
