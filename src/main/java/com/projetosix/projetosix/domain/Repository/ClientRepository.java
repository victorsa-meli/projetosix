package com.projetosix.projetosix.domain.Repository;

import com.projetosix.projetosix.domain.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Cliente, Long> {

    Cliente findByNome (String nome);

}
