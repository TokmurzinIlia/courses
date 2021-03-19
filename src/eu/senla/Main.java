package eu.senla;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        // write your code here
        MyArrayList<String> myArrayList = new MyArrayList(7);
        myArrayList.add(1, "25");
        myArrayList.add(2, "25");
        myArrayList.add(3, "654");
        myArrayList.add(4, "2858");
        myArrayList.add(5, "2345");
        myArrayList.add(6, "567");
        myArrayList.add(7, "459");

        System.out.println(myArrayList);
        System.out.println(myArrayList.get(5));
        System.out.println(myArrayList.indexOf("567"));
        System.out.println(myArrayList.lastIndexOf("25"));
        myArrayList.remove(2);
        System.out.println(myArrayList);
        myArrayList.set(6,"123");
        System.out.println(myArrayList);

    }

}
