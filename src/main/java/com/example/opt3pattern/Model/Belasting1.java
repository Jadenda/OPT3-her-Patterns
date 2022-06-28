package com.example.opt3pattern.Model;

import java.util.ArrayList;

public class Belasting1 {
        private double belasting;

        public static ArrayList<Belasting1> getBelastingList() {
                return BelastingList;
        }

        private static ArrayList<Belasting1> BelastingList;

        public Belasting1(double Belasting) {
                this.belasting = Belasting;
                BelastingList.add(this);
        }

        public double getBelasting() {
                return belasting;
        }
}
