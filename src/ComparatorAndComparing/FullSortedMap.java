package ComparatorAndComparing;

import java.util.*;
import java.util.stream.Collectors;

public class FullSortedMap {

    private static Set<Map.Entry<String, Integer>> tree
            = new TreeSet<>(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
    private static Set<Map.Entry<String, Integer>> tree2
            = new TreeSet<>(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
    private static Set<Map.Entry<String, Integer>> tree3
            = new TreeSet<>(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));
    private static Set<Map.Entry<String, Integer>> tree4
            = new TreeSet<>(Map.Entry.<String, Integer>comparingByValue().reversed().thenComparing(Map.Entry.comparingByKey()));

    private static Map<String, Integer> map = new TreeMap<String, Integer>() {{
        put("aaa", 3);
        put("text", 10);
        put("trol", 1);
        put("lo", 2);
        put("a", 1);
    }};

    public static void start() {
        //tree.addAll(map.entrySet().stream().collect(Collectors.toSet()));
        tree.addAll(map.entrySet());
        tree.forEach(System.out::println);
    }

}

