package com.bridge.labz;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter number");
        int num=sc.nextInt ();
        if (num>1 && num<=10){
            System.out.println ("greater Then One");
        }
        else if (num>10 && num<=100) {
            System.out.println ("greater then ten");
        }

        else if (num>100 && num<=1000) {
            System.out.println ("greater then hundred");
        }
        else {
            System.out.println ("greater 1000");
        }
    }
}
