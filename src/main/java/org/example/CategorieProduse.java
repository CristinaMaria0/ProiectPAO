package org.example;

import java.util.ArrayList;

public class CategorieProduse {
    private String nume;
    private ArrayList<Produs> produse;

    public CategorieProduse(String nume) {
        this.nume = nume;
        produse = new ArrayList<Produs>();
    }

    public String getNume() {
        return nume;
    }

    public ArrayList<Produs> getProduse() {
        return produse;
    }

    public void adaugaProdus(Produs produs) {
        produse.add(produs);
    }

    public void stergeProdus(Produs produs) {
        produse.remove(produs);
    }
}
