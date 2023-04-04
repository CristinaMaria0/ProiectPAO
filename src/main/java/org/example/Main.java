package org.example;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        // Creare magazin
        Magazin magazin = new Magazin("Magazinul Meu");
        // Adaugare categorii produse
        CategorieProduse electronice = new CategorieProduse("Electronice");
        CategorieProduse electrocasnice = new CategorieProduse("Electrocasnice");
        CategorieProduse dulciuri= new CategorieProduse("Dulciuri");
        magazin.adaugaCategorieProduse(electronice);
        magazin.adaugaCategorieProduse(electrocasnice);
        magazin.adaugaCategorieProduse(dulciuri);
        // Adaugare produse
        Produs produs1 = new Produs("Laptop HP", 1,electronice, 100, 4000.0);
        Produs produs2 = new Produs("Televizor Samsung", 2, electronice,120,2500.0);

        Produs produs3 = new Produs("Fier de calcat Philips", 10, electrocasnice,77,200.0);
        Produs produs4 = new Produs("Masina de spalat LG", 11,electrocasnice,51,3000.0);

        Date dataExp = dateFormat.parse("30-04-2023");
        ProdusAlimentar produs5= new ProdusAlimentar("Ciocolata",21,dulciuri,150,5.99, dataExp,"Romania");
        magazin.adaugaProdus(produs1);
        magazin.adaugaProdus(produs2);
        magazin.adaugaProdus(produs3);
        magazin.adaugaProdus(produs4);
        magazin.adaugaProdus(produs5);


        // Adaugare distribuitori
        Distribuitor distribuitor1 = new Distribuitor("Distribuitor 1");
        Distribuitor distribuitor2 = new Distribuitor("Distribuitor 2");
        magazin.adaugaDistribuitor(distribuitor1);
        magazin.adaugaDistribuitor(distribuitor2);
        magazin.stergeDistribuitor(distribuitor1);
        // Adaugare angajati
        Angajat angajat1 = new Angajat("Popescu Ion");
        Angajat angajat2 = new Angajat("Ionescu Maria");
        magazin.adaugaAngajat(angajat1);
        magazin.adaugaAngajat(angajat2);

        // Creare comanda
        ArrayList<Produs> produse_comanda = new ArrayList<>();
        produse_comanda.add(produs1);
        produse_comanda.add(produs4);
        Comanda comanda = new Comanda(100, produse_comanda,"Iuliu Maniu, nr 1", "2023-04-01");

        // Adaugare si stergere comanda
        magazin.adaugaComanda(comanda);
        magazin.stergeComanda(comanda);

        // Creare factura
        ArrayList<Produs> produseFactura = new ArrayList<Produs>();
        produseFactura.add(produs1);
        produseFactura.add(produs2);
        Factura factura = new Factura(1, produseFactura, 6500.0, "2023-04-01");

        // Adaugare si stergere factura
        magazin.adaugaFactura(factura);
        magazin.stergeFactura(factura);


        System.out.println(magazin.cautareProdusePretMaiMicDecat(100.0));

        System.out.println(magazin.cautareProduseDinCategorie(electronice));

        System.out.println(magazin.calculeazaValoareStoc());

        System.out.println(magazin.getProduseInStoc());

        produs1.setCantitate(0);

        System.out.println(magazin.getProduseInStoc());


        System.out.println(produs1);
        System.out.println(produs5);

    }



}
