package pointers;

import java.util.HashMap;

public class UsingPointer {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value", 11);
        map2 = map1;

        map1.put("value", 22);

        System.out.println("map 1: "+ map1);
        System.out.println("map 2: "+ map2);
    }
}
