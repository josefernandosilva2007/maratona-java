package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        map.put("A", "LETRA A");
        map.put("D", "LETRA D");
        map.put("E", "LETRA E");
        map.put("C", "LETRA C");
        map.put("B", "LETRA B");

        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+ entry.getValue());
        }
    }
}
