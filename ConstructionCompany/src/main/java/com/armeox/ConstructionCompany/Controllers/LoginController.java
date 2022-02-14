package com.armeox.ConstructionCompany.Controllers;

import com.armeox.ConstructionCompany.Domain.Utente;
import com.armeox.ConstructionCompany.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/login")
public class LoginController {

    @Autowired
    LoginService service ;

    @PostMapping
    public boolean makeLogin(@RequestBody Utente u) {
        return service.get(u) ;
    }
}
