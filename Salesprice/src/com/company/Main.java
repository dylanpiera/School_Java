package com.company;

/**
 * Made by Dylan Piera 7-9-2016 - Practica Excercise 2. Make an application that calculates the salesprice for a product.
 */

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static int profitPercentage;
    public static double inPrice, outPrice;

    public static void main(String[] args) {

        inPrice = getInPrice();
        profitPercentage = getProfitPercentage();
        
        calcPrice(profitPercentage, inPrice);
    }

    private static void calcPrice(int inPercentage, double inPrice) {

        float percentage = (float)inPercentage/100;

        System.out.printf("The sales price, exclusive of tax will be: € %6.2f \n",((inPrice * (percentage + 1))));
        System.out.printf("The sales price, with 6 percent tax will be: € %6.2f \n",((inPrice * (percentage + 1)) * (1.06)));
        System.out.printf("The sales price, with 21 percent tax will be: € %6.2f \n",((inPrice * (percentage + 1)) * (1.21)));

    }

    private static int getProfitPercentage() {
        System.out.println("Please fill in the Company Profit Percentage:");
        int inPercentage = in.nextInt();

        return inPercentage;
    }

    private static double getInPrice() {
        System.out.println("Please fill in the Company Purchase Price:");
        double in_Price = in.nextDouble();

        return in_Price;
    }


}
