package com.example.opt3pattern.Model;

import java.util.ArrayList;

public class Belasting1 {
        private double belasting;
        private static ArrayList<Belasting1> BelastingList = new ArrayList<>();

        public Belasting1(double Belasting) {
                this.belasting = Belasting;
                BelastingList.add(this);
        }

        public static ArrayList<Belasting1> getBelastingList() {
                return BelastingList;
        }

        public double getBelasting() {
                return belasting;
        }
}
