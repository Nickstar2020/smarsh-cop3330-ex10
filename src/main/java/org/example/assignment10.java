/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //gather all price and quantity
        System.out.println("Enter the price of item 1  :");
        double price1 = scan.nextInt();
        System.out.println("Enter quantity of item 1   :");
        int quantity1 = scan.nextInt();
        System.out.println("Enter the price of item 2  :");
        double price2 = scan.nextInt();
        System.out.println("Enter quantity of item 2   :");
        int quantity2 = scan.nextInt();
        System.out.println("Enter the price of item 3  :");
        double price3 = scan.nextInt();
        System.out.println("Enter quantity of item 3   :");
        int quantity3 = scan.nextInt();

        //math for all of them
        double subtotal = (price1 * quantity1) + (price2 * quantity2) + (price3 * quantity3);
        double tax = subtotal * 0.055;
        double total = subtotal + tax;

        //print out math
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax     : $" + String.format("%.2f", tax));
        System.out.println("Total   : $" + String.format("%.2f", total));
    }
}
