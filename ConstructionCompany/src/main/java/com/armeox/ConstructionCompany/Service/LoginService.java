package com.armeox.ConstructionCompany.Service;

import com.armeox.ConstructionCompany.Domain.Utente;
import com.armeox.ConstructionCompany.Repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository log_repo ;

    public boolean get(Utente u) {
        //ExampleMatcher modelMatcher = ExampleMatcher.matchingAll();
        Example<Utente> user_example = Example.of(u) ;
        return log_repo.exists(user_example) ;
    }
}
