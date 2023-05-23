package org.example;

public class Angajat {
    private int id;
    private String nume;
    private String pozitie;

    public Angajat(int id, String nume, String pozitie) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }
    public int getId(){return  id;}
    public String getPozitie(){return pozitie;}
}
