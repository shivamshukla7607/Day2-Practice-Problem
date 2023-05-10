package com.bridge.labz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter month");
        int mont= sc.nextInt ();
        System.out.println ("Enter Day");
        int day= sc.nextInt ();
        if (day>=1 && day<31 && mont<=3){
            System.out.println ("True");
        }
        else {
            System.out.println ("False");
        }
    }
}
