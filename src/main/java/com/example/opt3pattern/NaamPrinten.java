package com.example.opt3pattern;

public abstract class NaamPrinten implements getcollegaNummer, getnaam {
    private int CollegaNummer;
    private String Naam;

     public abstract void collegaNummer();
     public abstract void naam();


    public void NaamPrinten(){
        collegaNummer();
        naam();
    }

    public int getCollegaNummer() {
        return CollegaNummer;
    }

    public void setCollegaNummer(int CollegaNummer) {
        this.CollegaNummer = CollegaNummer;
    }
    public String getNaam() {
        return Naam;
    }

    public void setNaam(String Naam) {
        this.Naam = Naam;
    }
}
