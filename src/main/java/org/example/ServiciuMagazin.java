package org.example;

import java.util.ArrayList;
import java.util.List;

public class ServiciuMagazin {
    private ArrayList<Distribuitor> listaDistribuitori;
    private ArrayList<Angajat> listaAngajati;
    private ArrayList<Comanda> listaComenzi;
    private ArrayList<Factura> listaFacturi;
    private  ArrayList<Sofer> listaSoferi;
    public ServiciuMagazin() {
        listaDistribuitori = new ArrayList<>();
        listaAngajati = new ArrayList<>();
        listaComenzi = new ArrayList<>();
        listaFacturi = new ArrayList<>();
        listaSoferi = new ArrayList<>();
    }

    public void insertSofer(Sofer sofer){
        listaSoferi.add(sofer);
    }
    public void stergeSofer(Sofer sofer){
        listaSoferi.remove(sofer);
    }
    public void adaugaDistribuitor(Distribuitor distribuitor) {

        listaDistribuitori.add(distribuitor);
    }

    public void stergeDistribuitor(Distribuitor distribuitor) {

        listaDistribuitori.remove(distribuitor);
    }

    public void adaugaAngajat(Angajat angajat) {

        listaAngajati.add(angajat);
    }

    public void stergeAngajat(Angajat angajat) {

        listaAngajati.remove(angajat);
    }

    public void adaugaComanda(Comanda comanda) {

        listaComenzi.add(comanda);
    }

    public void stergeComanda(Comanda comanda) {

        listaComenzi.remove(comanda);
    }

    public void adaugaFactura(Factura factura) {

        listaFacturi.add(factura);
    }

    public void stergeFactura(Factura factura) {

        listaFacturi.remove(factura);
    }
/*

    //1. Cauta comanda dupa id
    public Comanda cautaComandaDupaId(Integer id) {

        return this.comenzi.get(id);
    }

    //2. Cauta produsele cu un pret mai mic decat un numar dat
    public ArrayList<Produs> cautareProdusePretMaiMicDecat(double pret) {
        ArrayList<Produs> produse = new ArrayList<>();
        for (Produs produs : listaProduse) {
            if (produs.getPret() < pret) {
                produse.add(produs);
            }
        }
        return produse;
    }

    //3. Calculeaza valoarea totala a stocului
    public double calculeazaValoareStoc() {
        double valoareStoc = 0;
        for (Produs produs : listaProduse) {
            valoareStoc += produs.getPret() * produs.getCantitate();
        }
        return valoareStoc;
    }

    //4. Cautarea produselor dintr-o anumita categorie
    public ArrayList<Produs> cautareProduseDinCategorie(String categorie) {
        ArrayList<Produs> produse = new ArrayList<>();
        for (Produs produs : listaProduse) {
            if (produs.getCategorie() == categorie) {
                produse.add(produs);
            }
        }
        return produse;
    }

    //5. Returneaza produsele care se afla in stoc
    public List<Produs> getProduseInStoc() {
        List<Produs> produseInStoc = new ArrayList<>();
        for (Produs produs : listaProduse) {
            if (produs.getCantitate() > 0) {
                produseInStoc.add(produs);
            }
        }
        return produseInStoc;
    }



 */
}
