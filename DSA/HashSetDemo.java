package DSA;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
//        HashSet<Integer> h = new HashSet<>();
//        h.add(14);
//        h.add(58);
//        System.out.println(h);
//        System.out.println(h.size());


        HashMap<String,Integer>map = new HashMap<>();
        map.put("india",1);
        map.put("usa",2);
        System.out.println(map.get("usa"));
        map.get(4);
        System.out.println(map.containsKey("sds"));
        System.out.println(map.getOrDefault("nepal",2));
//
//        Hashtable<String,Integer>map = new Hashtable<>();
//        map.put("india",12);
//        System.out.println(map);
    }
}
