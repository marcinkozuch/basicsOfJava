package FrameworkCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.add(0, 10); // adding 10 to beggining of list - 0 is index, 10 is value

        for (Integer i : arrayList) {
            System.out.println(i);
        }

        int x = arrayList.get(0);
        arrayList.remove(1);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "Value1");
        hashMap.put(3, "Value2");
        hashMap.put(5, "Value3");
        hashMap.put(11, "Value4");

        System.out.println(hashMap.get(11));

        // Convert HashMap to list
        ArrayList<String> mapList = new ArrayList<>(hashMap.values());

        Collections.shuffle(mapList);   // random shuffle

        for (String s : mapList)
            System.out.println(s);
    }
}
