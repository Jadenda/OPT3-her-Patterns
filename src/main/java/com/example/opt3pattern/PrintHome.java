package com.example.opt3pattern;

public class PrintHome extends NaamPrinten implements getnaam, getcollegaNummer{
    @Override
    public void collegaNummer() {
        setCollegaNummer(1);
        System.out.println(getCollegaNummer());
    }

    @Override
    public void naam() {
        setNaam("Marcel van der Ploeg");
    }
}
