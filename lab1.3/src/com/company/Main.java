package com.company;

import java.util.Scanner;

public class Main {
    static int count;
    static int A;
    static int B;

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);







     do {

           System.out.println("Enter volume of cargo: ");
           int v = Sc.nextInt();
           System.out.println("Enter weight of cargo: ");
           int w = Sc.nextInt();
           Truck x = new Truck(v, w);
        if (v <= x.CountVol && w <= x.CountWeight) {
            count = 1;
            x.Load();
            System.out.println(x.res);
            A = x.CountVol;
            B = x.CountWeight;
        
        }
        else {
            System.out.println("You have exceeded the cargo limit!");
            }

        System.out.println("ADD VALUES - 1 // END - 2");
        count = Sc.nextInt();


    }while(count == 1);
}}