package com.pluralsight.calcengine3;

public class Earth {

    long circumferenceInMiles = 24901;
    long circumferenceInKilometers = Math.round(circumferenceInMiles * 1.6d);

    public void printEarth() {
        System.out.print("Circumference in Miles:  ");
        System.out.println(circumferenceInMiles);
        System.out.print("Circumference in Kilometers:  ");
        System.out.println(circumferenceInKilometers);
    }


}
