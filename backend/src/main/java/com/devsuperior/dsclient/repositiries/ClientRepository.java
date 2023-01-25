package com.devsuperior.dsclient.repositiries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
