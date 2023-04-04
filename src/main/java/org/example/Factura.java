package org.example;

import java.util.ArrayList;

public class Factura {
    private int numarFactura;
    private ArrayList<Produs> produse;
    private double valoare;
    private String dataEmitere;

    // Constructor
    public Factura(int numarFactura, ArrayList<Produs> produse, double valoare, String dataEmitere) {
        this.numarFactura = numarFactura;
        this.produse = produse;
        this.valoare = valoare;
        this.dataEmitere = dataEmitere;
    }

    // Metode de acces
    public int getNumarFactura() {
        return numarFactura;
    }

    public ArrayList<Produs> getProduse() {
        return produse;
    }

    public double getValoare() {
        return valoare;
    }

    public String getDataEmitere() {
        return dataEmitere;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

}
