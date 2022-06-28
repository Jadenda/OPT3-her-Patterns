package com.example.opt3pattern.Model;

import java.util.ArrayList;

public class Kosten1 {
    private double kosten;

    public static ArrayList<Kosten1> getKostenList() {
        return KostenList;
    }

    private static ArrayList<Kosten1> KostenList;

    public Kosten1 (double Kosten) {
        this.kosten = Kosten;
        KostenList.add(this);
    }

    public double getKosten() {
        return kosten;
    }
}
