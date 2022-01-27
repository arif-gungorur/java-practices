package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {
        String str = "Ali came to school and Mehmet came to school.";
        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));

        List<String> listWord = new ArrayList<>();
        for (String w : arr) {
            listWord.add(w.replaceAll("\\W", ""));
        }
        System.out.println(listWord);

        Map <String, Integer> NumberOfWords = new HashMap<>();
        for (String w : listWord) {
            if (NumberOfWords.containsKey(w)) {
                NumberOfWords.put(w,NumberOfWords.get(w)+1);
            }
            else {
                NumberOfWords.put(w, 1);
            }
        }
        System.out.println(NumberOfWords);
    }

}

