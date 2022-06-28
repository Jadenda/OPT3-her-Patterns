package com.example.opt3pattern.Model;

import java.util.ArrayList;

public class Opbrengsten1 {
    private double opbrengsten;
    private static ArrayList<Opbrengsten1> OpbrengstenList = new ArrayList<>();

    public Opbrengsten1 (double Opbrengsten) {
        this.opbrengsten = Opbrengsten;
        OpbrengstenList.add(this);
    }

    public double getOpbrengsten() {
        return opbrengsten;
    }
    public static ArrayList<Opbrengsten1> getOpbrengstenList() {
        return OpbrengstenList;
    }


}
