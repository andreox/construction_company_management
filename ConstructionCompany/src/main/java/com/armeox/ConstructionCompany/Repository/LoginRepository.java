package com.armeox.ConstructionCompany.Repository;

import com.armeox.ConstructionCompany.Domain.Utente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Utente, String> {
}
