package com.example.opt3pattern.Model;

import java.util.ArrayList;

public abstract class Account {
    private String gebruikersnaam;
    private String wachtwoord;

    public static ArrayList<Gebruiker> getGebruikerList() {
        return GebruikerList;
    }

    private static ArrayList<Gebruiker> GebruikerList = new ArrayList<>();
    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }
}
