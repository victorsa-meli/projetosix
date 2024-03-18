package com.projetosix.projetosix.router;

import com.projetosix.projetosix.domain.Entity.Cliente;
import com.projetosix.projetosix.domain.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteRouter {


   ClienteService service;

    public ClienteRouter(ClienteService service) {
        this.service = service;
    }


    @GetMapping
    ResponseEntity<List<Cliente>> listaCliente(){
        List<Cliente> listCliente =  service.consultarTodos();
       return ResponseEntity.ok(listCliente);
    }



    @PostMapping
     ResponseEntity criarCliente (@RequestBody Cliente data){

        Cliente result = service.criarCliente(data);

        if(Objects.isNull(result)){
            ResponseEntity.ok("Cliente já cadastrado! ");
        }

        return ResponseEntity.ok().body(result);
    }

}
