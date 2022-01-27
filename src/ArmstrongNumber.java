package src;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a digit to check if it armstrong number or not");
        int n =  scan.nextInt();
        int c = n ;
        int d= 0;
        int subD= 0;

        while (n>0) {
            d = n%10;
            subD += d*d*d;
            n= n/10;

        }

        if (c==subD) {
            System.out.println("The digit s armstrong number");
        }
        else {
            System.out.println("the digit s not armstrong number");
        }
    }

}

