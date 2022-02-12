package com.armeox.ConstructionCompany.Service;

import com.armeox.ConstructionCompany.Domain.Cliente;
import com.armeox.ConstructionCompany.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repo ;

    public List<Cliente> findAll() {
        return repo.findAll() ;
    }

    public Cliente save(Cliente cliente) {
        return repo.save(cliente) ;
    }
}
