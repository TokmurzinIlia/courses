package eu.senla;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<CPU> list = new ArrayList<>();
        CPU cpu1 = new CPU("AMD Ryzen 5 1600", 3200);
        CPU cpu2 = new CPU("AMD Ryzen 3 3200G", 3600);
        CPU cpu3 = new CPU("AMD Ryzen 5 3400G", 3700);
        CPU cpu4 = new CPU("AMD  Athlon X4 830 Kaveri BOX", 3000);
        CPU cpu5 = new CPU("AMD Pinnacle Ridge 2600 BOX", 3400);
        CPU cpu6 = new CPU("Intel Core i3 Coffee Lake", 4000);
        CPU cpu7 = new CPU("Intel Core i5-7400 Kaby Lake", 3000);
        CPU cpu8 = new CPU("i5-8400 Coffee Lake", 2800);
        CPU cpu9 = new CPU("i7-7700 Kaby Lake", 3600);
        CPU cpu10 = new CPU("i7-8700K Coffee Lake", 3700);
        //Создание стрима из коллекции
        Collection<CPU> collection = Arrays.asList(cpu1, cpu2, cpu3, cpu4, cpu5, cpu6, cpu7, cpu8, cpu9, cpu10);
        collection.stream()
//        //Создание стрима из массива
//        CPU[] array = {cpu1, cpu2, cpu3, cpu4, cpu5, cpu6, cpu7, cpu8, cpu9, cpu10};
//        Stream<CPU> streamFromArrays = Arrays.stream(array);
//        //Создание стрима из файла (каждая строка в файле будет отдельным элементом в стриме)
//        try {
//            Stream<String> streamFromFiles = Files.lines(Paths.get("CPU.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        .filter(CPU -> CPU.getFrequency() > 3500)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println();

        Collection<CPU> collection1 = Arrays.asList(cpu1, cpu2, cpu3, cpu4, cpu5, cpu6, cpu7, cpu8, cpu9, cpu10);
        collection1.stream()


                .skip(collection1.size() - 1)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println();

        //    distinct	Возвращает стрим без дубликатов (для метода equals)

        Collection<CPU> collection2 = Arrays.asList(cpu1, cpu2, cpu4, cpu4, cpu6, cpu6, cpu7, cpu7, cpu9, cpu9);
        collection2.stream()
        .distinct()
        .peek(System.out::println)
        .collect(Collectors.toList());

        System.out.println();

//      //  map	Преобразует каждый элемент стрима
    collection.stream()
            .map((s) -> "Hello" + s )
            .peek(System.out::println)
            .collect(Collectors.toList());

        System.out.println();

//    //    peek	Возвращает тот же стрим, но применяет функцию к каждому элементу стрима
    collection.stream()
          //  .map(String::toUpperCase)
            .peek((e) -> System.out.println( e + "///////"))
            .collect(Collectors.toList());

        System.out.println();

//        //limit	Позволяет ограничить выборку определенным количеством первых элементов
    collection.stream()
            .limit(4)
            .peek(System.out::println)
            .collect(Collectors.toList());

        System.out.println();

//        //sorted	Позволяет сортировать значения либо в натуральном порядке, либо задавая Comparator
//    collection.stream()
//            .sorted((o1,o2) -> o1.getFrequency().compareTo(o2.getFrequency()))
//            .collect(Collectors.toList());
    //    mapToInt, mapToDouble, mapToLong	Аналог map, но возвращает числовой стрим (то есть стрим из числовых примитивов)
    collection.stream()
            .mapToDouble((s) -> Integer.parseInt(s)).toArray()
//        //flatMap, flatMapToInt, flatMapToDouble, flatMapToLong	Похоже на map, но может создавать из одного элемента несколько
//        collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new)

    }
}
