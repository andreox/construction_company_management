package com.armeox.ConstructionCompany.Controllers;

import com.armeox.ConstructionCompany.Domain.Cliente;
import com.armeox.ConstructionCompany.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/clienti")
public class ClienteController {

    @Autowired
    private ClienteService service ;

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {

        return service.save(cliente) ;

    }

    @GetMapping
    public List<Cliente> findAll() {
        return service.findAll() ;
    }

}
