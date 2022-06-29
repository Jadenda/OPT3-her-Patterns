package com.example.opt3pattern;

public class PrintHome extends NaamPrinten{
    @Override
    void collegaNummer() {
        setCollegaNummer(1);
        System.out.println(getCollegaNummer());
    }

    @Override
    void naam() {
        setNaam("Marcel van der Ploeg");
    }
}
