package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a list elements , to stop enter '*'");
        String str = " ";
        List<String> list = new ArrayList<>();
        while (!str.equals("*")) {
            str = scan.next();
            if (!str.equals("*")) {
                list.add(str);
            }





        }
        System.out.println(list);
        Set<String> setList = new HashSet<>(list);

        System.out.println(setList);
    }

}

