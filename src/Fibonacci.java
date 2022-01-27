package src;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many fibonacci number do you want to see");
        int number = scan.nextInt();

        int f1 = 1;
        int f2 = 1 ;
        int fbnc= 0;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");

        for (int i = 0; i < number-1; i++) {
            fbnc= f1+f2;
            f1=f2;
            f2=fbnc;

            System.out.print(fbnc+ " ");

        }

    }

}
