package eu.senla;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyArrayList<String>  myArrayList = new MyArrayList(7);
        myArrayList.add(1,"25");
        myArrayList.add(2,"25");
        myArrayList.add(3,"654");
        myArrayList.add(4,"2858");
        myArrayList.add(5,"2345");
        myArrayList.add(6,"567");
        myArrayList.add(7,"459");

        System.out.println(myArrayList);
      //  myArrayList.sort(myArrayList, new So);
    }
}
