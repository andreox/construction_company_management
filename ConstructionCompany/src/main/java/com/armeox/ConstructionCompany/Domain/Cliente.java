package com.armeox.ConstructionCompany.Domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Client_id ;
    private String nome ;
    private String indirizzo ;
    private String telefono ;

    public Cliente() {}
    public Cliente(Integer id, String nome, String indirizzo, String telefono) {
        this.Client_id = id;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    public Cliente(String nome, String indirizzo, String telefono) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    public Integer getId() {
        return Client_id;
    }

    public void setId(Integer id) {
        this.Client_id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
