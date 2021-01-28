package com.company.jones;

public class Main {

    public static void main(String[] args) {
        String city = "Columbus";
        int zip = 43215;
        int[] temperature = {32, 25, 27, 40, 45};
        float total = 0;
        for (int i = 0; i < temperature.length; i++)
            total += temperature[i];
        total /= temperature.length;
        System.out.println("city: " + city + " zip code: " + zip + " avg high temperature: " + total);

    }
}
