package com.example.opt3pattern.Model;

import java.util.ArrayList;

public class Kosten1 {
    private double kosten;
    private static ArrayList<Kosten1> KostenList = new ArrayList<>();

    public Kosten1 (double Kosten) {
        this.kosten = Kosten;
        KostenList.add(this);
    }

    public static ArrayList<Kosten1> getKostenList() {
        return KostenList;
    }

    public double getKosten() {
        return kosten;
    }
}
