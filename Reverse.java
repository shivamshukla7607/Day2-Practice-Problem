package com.bridge.labz;

public class Reverse {
        public static void main(String[] args) {
            int num = 231, reversed = 0 ,temp;
            System.out.println("Original Number: " + num);
            while(num != 0) {
                temp = num % 10;
                reversed = reversed * 10 + temp;
                num =num/10;
            }

            System.out.println("Reversed Number: " + reversed);
        }
    }

