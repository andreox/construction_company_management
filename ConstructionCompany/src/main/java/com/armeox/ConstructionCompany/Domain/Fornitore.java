package com.armeox.ConstructionCompany.Domain;

public class Fornitore {

    private int id ;
    private String nome ;
    private String indirizzo ;
    private String telefono ;

    public Fornitore(int id, String nome, String indirizzo, String telefono) {
        this.id = id;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
