package org.example;

import java.util.ArrayList;

public class Comanda {
    private ArrayList<Produs> produse;
    private String adresaLivrare;
    private String dataPlasare;

    public Comanda(ArrayList<Produs> produse, String adresaLivrare, String dataPlasare) {
        this.produse = produse;
        this.adresaLivrare = adresaLivrare;
        this.dataPlasare = dataPlasare;
    }

    public ArrayList<Produs> getProduse() {
        return produse;
    }

    public String getAdresaLivrare() {
        return adresaLivrare;
    }

    public String getDataPlasare() {
        return dataPlasare;
    }
}
