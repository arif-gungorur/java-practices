package src;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type 2 words to check if they are anagram or not");
        String s1 = scan.next();
        String s2 = scan.next();

        isAnagram(s1,s2);





    }

    private static void isAnagram(String s1, String s2) {
        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);

        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("They are anagram");
        }
        else {
            System.out.println("They are not anagram");
        }

    }

}

