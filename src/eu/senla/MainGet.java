package eu.senla;

import java.util.Arrays;
import java.util.Collection;

public class MainGet {

    public static void main(String[] args) {
        // write your code here

        MyArrayList<String> myArrayList = new MyArrayList(7);
        System.out.println(myArrayList.get(-5));
        myArrayList.add(100, "25");
        myArrayList.add(1, "25");
        myArrayList.add(2, "654");
        myArrayList.add(3, "2858");
        myArrayList.add(4, "2345");
        myArrayList.add(5, "567");
        myArrayList.add(6, "459");

        System.out.println(myArrayList);


        System.out.println(myArrayList);




    }

}
