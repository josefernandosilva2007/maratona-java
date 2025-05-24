package academy.devdojo.maratonajava.javacore.Ycolecoes;

import java.util.HashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("vc","voce");
        map.put("blz", "beleza");
        map.put("vlw", "valeu");
        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println(key + "=" + map.get(key));
        }
    }
}
