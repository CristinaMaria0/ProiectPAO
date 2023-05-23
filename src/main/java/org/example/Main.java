package org.example;


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
        Magazin magazin = new Magazin("Magazinul Meu", "Strada 1", "Popescu Cristina");


        // Adaugare produse
        Produs produs1 = new Produs("Laptop HP", 1,"Electronice", 100, 4000.0);
        Produs produs2 = new Produs("Televizor Samsung", 2, "Electronice",120,2500.0);

        Produs produs3 = new Produs("Fier de calcat Philips", 10, "Electrocasnice",77,200.0);
        Produs produs4 = new Produs("Masina de spalat LG", 11,"Electrocasnice",51,3000.0);

        Date dataExp = dateFormat.parse("30-04-2023");
        ProdusAlimentar produs5= new ProdusAlimentar("Ciocolata",21,"Dulciuri",150,5.99, dataExp,"Romania");


        magazin.adaugaProdus(produs1);
        magazin.adaugaProdus(produs2);
        magazin.adaugaProdus(produs3);
        magazin.adaugaProdus(produs4);
        magazin.adaugaProdus(produs5);

        ServiciuMagazin serviciu= new ServiciuMagazin();

        // Adaugare distribuitori
        Distribuitor distribuitor1 = new Distribuitor("Distribuitor 1", "Adresa 1");
        Distribuitor distribuitor2 = new Distribuitor("Distribuitor 2", "Adresa 2");

        serviciu.adaugaDistribuitor(distribuitor1);
        serviciu.adaugaDistribuitor(distribuitor2);
        serviciu.stergeDistribuitor(distribuitor1);
        // Adaugare angajati
        Angajat angajat1 = new Angajat(1, "Popescu Ion","pozitie 1");
        Angajat angajat2 = new Angajat(2, "Ionescu Maria","pozitie 2");

        serviciu.adaugaAngajat(angajat1);
        serviciu.adaugaAngajat(angajat2);

        // Creare comenzi
        ArrayList<Produs> produse_comanda1 = new ArrayList<>();
        produse_comanda1.add(produs1);
        produse_comanda1.add(produs4);
        Comanda comanda = new Comanda(100, produse_comanda1,"Iuliu Maniu, nr 1", "2023-04-01");

        // Creare factura
        ArrayList<Produs> produseFactura1 = new ArrayList<Produs>();
        produseFactura1.add(produs1);
        produseFactura1.add(produs2);
        Factura factura1 = new Factura(1, produseFactura1, "2023-04-01");
        double pret=factura1.calculTotal(produseFactura1);
        factura1.setValoare(pret);

        // Adaugare si stergere factura
        serviciu.adaugaFactura(factura1);
        serviciu.stergeFactura(factura1);






        
    }

}
