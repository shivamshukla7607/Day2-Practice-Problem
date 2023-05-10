package com.bridge.labz;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int no=sc.nextInt ();
        int rev=0, temp=no ,rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        if (no==rev){
            System.out.println (no+" Is Palindrome");
        }
        else{
            System.out.println ("Not Palindrome");
        }
    }
}
