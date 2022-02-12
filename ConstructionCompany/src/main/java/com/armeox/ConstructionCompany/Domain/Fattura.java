package com.armeox.ConstructionCompany.Domain;


import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Fattura {

    private int id ;
    private boolean acquisto ;

    public Fattura( int id, boolean acquisto ) {
        this.id = id ;
        this.acquisto = acquisto ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAcquisto() {
        return acquisto;
    }

    public void setAcquisto(boolean acquisto) {
        this.acquisto = acquisto;
    }
}
