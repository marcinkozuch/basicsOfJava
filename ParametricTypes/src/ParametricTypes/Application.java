package ParametricTypes;

import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add(1);
        arrayList.add(1.2222);
        arrayList.add("mouse");

        String animal = (String) arrayList.get(2);

        for (Object str : arrayList) {
            System.out.println(str);
        }

        ArrayList<String> arrayList1 = new ArrayList<>();

        arrayList1.add("One");
        arrayList1.add("Two");
        arrayList1.add("Three");

        for(String str : arrayList1)
            System.out.println(str);

    }
}
