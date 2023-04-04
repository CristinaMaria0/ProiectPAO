package org.example;

public class Produs {
    private String nume;
    private int cod;
    private CategorieProduse categorie;
    private int cantitate;
    private double pret;

    public Produs(String nume, int cod, CategorieProduse categorie, int cantitate, double pret) {
        this.nume = nume;
        this.cod = cod;
        this.categorie = categorie;
        this.cantitate = cantitate;
        this.pret = pret;
    }



    public String getNume() {
        return nume;
    }

    public int getCod() {
        return cod;
    }

    public CategorieProduse getCategorie() {
        return categorie;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }
}
