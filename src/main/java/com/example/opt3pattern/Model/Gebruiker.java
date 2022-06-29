package com.example.opt3pattern.Model;

import java.util.ArrayList;

public class Gebruiker extends Account{
    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    private String gebruikersnaam;
    private String wachtwoord;

//    public static ArrayList<Gebruiker> getGebruikerList() {
//        return GebruikerList;
//    }
//
//    private static ArrayList<Gebruiker> GebruikerList = new ArrayList<>();

    public Gebruiker(String Gebruikersnaam, String Wachtwoord){
        this.gebruikersnaam = Gebruikersnaam;
        this.wachtwoord = Wachtwoord;
        getGebruikerList().add(this);
    }
}
