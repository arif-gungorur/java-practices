package src;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it s prime or not");
        int number = scan.nextInt();

        primeCalculator(number);
    }

    private static void primeCalculator(int number) {
        int count = 0 ;

        for (int i = 1; i <= number ; i++) {
            if (number%i==0) {
                count++ ;
            }
        }

        if (count==2) {
            System.out.println("The number is prime");
        }
        else {
            System.out.println("The number is not prime");
        }
    }

}

