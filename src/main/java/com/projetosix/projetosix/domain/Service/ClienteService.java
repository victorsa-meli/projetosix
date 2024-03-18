package com.projetosix.projetosix.domain.Service;


import com.projetosix.projetosix.domain.Entity.Cliente;
import com.projetosix.projetosix.domain.Repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Service
public class ClienteService {

    ClientRepository repository;

    private ClienteService(ClientRepository repository) {
        this.repository = repository;
    }

    public Cliente criarCliente(Cliente data){

      Cliente repositoryCliente = repository.findByNome(data.getNome());

        if(Objects.isNull(repositoryCliente)){
            repository.save(data);

            return repository.findByNome(data.getNome());
        }

        return null;

    }


    public List<Cliente> consultarTodos(){

        List<Cliente> listaClientes = repository.findAll();

        if (listaClientes.isEmpty()){
            return Collections.emptyList();
        }

        return listaClientes;

    }



}
