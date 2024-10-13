package Lesson_16.Task1;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    static void condition () {
        String[] input1 = {"a", "b", "a", "c", "b"};
        String[] input2 = {"c", "b", "a"};
        String[] input3 = {"c", "c", "c", "c"};

        System.out.println(

                wordMultiple(input1)); // {a=true, b=true, c=false}
        System.out.println(

                wordMultiple(input2)); // {a=false, b=false, c=false}
        System.out.println(

                wordMultiple(input3)); // {c=true}
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : strings) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        Map<String, Boolean> resultMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            resultMap.put(entry.getKey(), entry.getValue() >= 2);
        }

        return resultMap;
    }
}
