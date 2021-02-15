package eu.senla.task.task4;

import java.util.Arrays;

public class Array {

    String[][] createArray() {

        String rndString = "ASKJFPOWEOITRIUDFHJGASDKJFIHOEFRGJHBASDJBK";
        String array[][] = new String[10][10];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (j % 3 == 0) {
                    array[i][j] = String.valueOf(Math.random() * 10+1).substring(0, 6);

                } else {
                    array[i][j] = "";
                    for (int t = 0; t < 6 ;t++){
                        int buffer = (int)(Math.random()*rndString.length());
                        array[i][j] += String.valueOf(rndString.charAt(buffer));
                    }
                }

            }

        }

        return array;
    }
    String array[][] = createArray();

    void printArray(){

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    String[] sideDiagonal() {

        int i = array.length;
        int j;
        String[] sDiagonal = new String[i];
        for (i = 0, j = array[i].length - 1; j >= 0; i++, j--) {
            sDiagonal[i] = array[i][j];

        }

        return sDiagonal;

    }

    String[] sDiagonal = sideDiagonal();

    String[] homeDiagonal() {

        int i = array.length;
        int j;
        String[] hDiagonal = new String[i];
        for (i = 0, j = 0; i < array.length; i++, j++) {
            hDiagonal[i] = array[i][j];

        }
            return hDiagonal;
    }

    String[] hDiagonal = homeDiagonal();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return Arrays.equals(array, array1.array);
    }


void printDiagonals(){

    System.out.print("Home diagona: ");
    for (int i = 0; i < hDiagonal.length; i++) {

           System.out.print(hDiagonal[i] + " ");
              }
           System.out.println();

    System.out.print("Side diagonal: ");
    for (int i = 0; i < sDiagonal.length; i++) {

        System.out.print(sDiagonal[i] + " ");
    }
    System.out.println();

}

    void eqDiagonal(){

        boolean bull = Arrays.equals(hDiagonal,sDiagonal);
        System.out.println("Home diagonal == Side diagonal: " + bull);
    }

    String[] summDiagonals(){
            String [] summDiagonals = new String [hDiagonal.length + sDiagonal.length];
            int count = 0;
            for(int i = 0; i<hDiagonal.length; i++) {
                summDiagonals[i] = hDiagonal[i];
                count++;
            }
            for(int j = 0;j<sDiagonal.length;j++) {
                summDiagonals[count++] = sDiagonal[j];
            }

            return summDiagonals;
        }

        String[] summDiagonals = summDiagonals();

    void printSummDiagonals() {
        System.out.print("Summ diagonals ");
        for (int i = 0; i < summDiagonals.length; i++) {

            System.out.print(summDiagonals[i] + " ");
        }
        System.out.println();
    }

    String[] searchNumber() {

        int j = 0;
        String[] searchNumber = new String[summDiagonals.length];
        for (int i = 0; i < summDiagonals.length;  i++) {
            if (summDiagonals[i].contains(".")) {
                double buffer;
                searchNumber[j] = "";
                buffer = Double.parseDouble(summDiagonals[i]);
                if (buffer >= 1.7) {
                    buffer = Math.ceil(buffer);
                }
                    else {
                        buffer = Math.floor(buffer);}
                searchNumber[j++] = String.valueOf(buffer);
                }
            }
        String[] searchNumbers = new String[j];
        for (int i = 0; i < searchNumbers.length;  i++) {
            searchNumbers[i] = searchNumber[i];
        }

        return searchNumbers;   }


    String[] searchNumber = searchNumber();

    String searchString() {
        String[] searchString = new String[summDiagonals.length];
        int j = 0;

        for (int i = 0; i < summDiagonals.length;  i++) {
            if (summDiagonals[i].contains(".") == false) {
                searchString[j++] = summDiagonals[i].substring(1,4) + ",";
            }

        }
        String[] searchStrings = new String[j];
        for (int i = 0; i < searchStrings.length;  i++) {
            searchStrings[i] = searchString[i];
        }

        StringBuilder builder = new StringBuilder();
        for(String i : searchStrings) {
            builder.append(i);
        }
        String str = builder.toString();
        return str;   }

    String searchString = searchString();

    void printSearchNumber() {
        System.out.print("Numbers in array SummDiagonals ");
        for (int i = 0; i < searchNumber.length; i++) {

                System.out.print(searchNumber[i] + "_");

        }

        System.out.println();
    }
    void printSearchString () {
        System.out.print("Char in array SummDiagonals ");

            System.out.print(searchString);

        System.out.println();
    }

}
