package org.example;


import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private String nume;
    private ArrayList<CategorieProduse> categoriiProduse;
    private ArrayList<Distribuitor> distribuitori;
    private ArrayList<Angajat> angajati;
    private ArrayList<Comanda> comenzi;
    private ArrayList<Factura> facturi;

    public Magazin(String nume) {
        this.nume = nume;
        categoriiProduse = new ArrayList<CategorieProduse>();
        distribuitori = new ArrayList<Distribuitor>();
        angajati = new ArrayList<Angajat>();
        comenzi = new ArrayList<Comanda>();
        facturi = new ArrayList<Factura>();
    }

    public String getNume() {
        return nume;
    }

    public ArrayList<CategorieProduse> getCategoriiProduse() {
        return categoriiProduse;
    }

    public ArrayList<Distribuitor> getDistribuitori() {
        return distribuitori;
    }

    public ArrayList<Angajat> getAngajati() {
        return angajati;
    }

    public ArrayList<Comanda> getComenzi() {
        return comenzi;
    }

    public ArrayList<Factura> getFacturi() {
        return facturi;
    }

    public void adaugaCategorieProduse(CategorieProduse categorieProduse) {
        categoriiProduse.add(categorieProduse);
    }

    public void stergeCategorieProduse(CategorieProduse categorieProduse) {
        categoriiProduse.remove(categorieProduse);
    }

    public void adaugaDistribuitor(Distribuitor distribuitor) {
        distribuitori.add(distribuitor);
    }

    public void stergeDistribuitor(Distribuitor distribuitor) {
        distribuitori.remove(distribuitor);
    }

    public void adaugaAngajat(Angajat angajat) {
        angajati.add(angajat);
    }

    public void stergeAngajat(Angajat angajat) {
        angajati.remove(angajat);
    }

    public void adaugaComanda(Comanda comanda) {
        comenzi.add(comanda);
    }

    public void stergeComanda(Comanda comanda) {
        comenzi.remove(comanda);
    }

    public void adaugaFactura(Factura factura) {
        facturi.add(factura);
    }

    public void stergeFactura(Factura factura) {
        facturi.remove(factura);
    }


}
