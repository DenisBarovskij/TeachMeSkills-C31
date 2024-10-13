package Lesson_16.Task2;

import java.util.HashMap;
import java.util.Map;

public class Pairs {

    static void pairs () {
        Pairs p = new Pairs();
        String[] input1 = {"code", "bug"};
        String[] input2 = {"man", "moon", "main"};
        String[] input3 = {"man", "moon", "good", "night"};

        System.out.println(p.pairs(input1)); // {c=e, b=g}
        System.out.println(p.pairs(input2)); // {m=n}
        System.out.println(p.pairs(input3)); // {m=n, g=d, n=t}
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        for (String s : strings) {
            if (!s.isEmpty()) {
                resultMap.put(s.substring(0, 1), s.substring(s.length() - 1));
            }
        }
        return resultMap;
    }
}

