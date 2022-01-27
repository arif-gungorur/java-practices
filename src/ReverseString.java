package src;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a string");
        String str = scan.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb.reverse());


        System.out.println(rvrStr(str));






    }

    private static String rvrStr(String str) {
        String rvrStr = " ";
        for (int i = str.length()-1; i >=0; i--) {
            rvrStr+= str.charAt(i);

        }
        return rvrStr;

    }

}



