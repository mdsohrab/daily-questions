package earphone;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAP {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("A",3,"Z", 4,"P",7);
        System.out.println(map);
        map.get("A");
        map.get("C");
        System.out.println(map.get("C"));
        System.out.println(map.get("A"));
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("F"));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
        //unsorted and unordered maintianed
        //also print the null value
        Map<String, Integer>hashmap = new HashMap<>(map);
        System.out.println(hashmap);
        System.out.println(hashmap.put("Z",9));
        System.out.println(hashmap);
//Insertion ordered maintained
        LinkedHashMap<String, Integer>linkedHashMap = new LinkedHashMap<>(map);
        System.out.println(linkedHashMap);
        linkedHashMap.put("Chetan",34);
        System.out.println(linkedHashMap);
//sorted oder maintained
        TreeMap<String, Integer> treeMap = new TreeMap<>(linkedHashMap);
        System.out.println(treeMap);
    }
}
