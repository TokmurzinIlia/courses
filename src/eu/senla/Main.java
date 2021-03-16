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
        Stream<CPU> streamFromCollection = collection.stream();
//        //Создание стрима из массива
//        CPU[] array = {cpu1, cpu2, cpu3, cpu4, cpu5, cpu6, cpu7, cpu8, cpu9, cpu10};
//        Stream<CPU> streamFromArrays = Arrays.stream(array);
//        //Создание стрима из файла (каждая строка в файле будет отдельным элементом в стриме)
//        try {
//            Stream<String> streamFromFiles = Files.lines(Paths.get("CPU.txt"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        collection.stream().filter(frequency::equals).CPU();

        collection.stream().skip(collection.size() — 1).findFirst().orElse(«1»);

    //    distinct	Возвращает стрим без дубликатов (для метода equals)
    collection.stream().distinct().collect(Collectors.toList())
      //  map	Преобразует каждый элемент стрима
    collection.stream().map((s) -> s + "_1").collect(Collectors.toList())
    //    peek	Возвращает тот же стрим, но применяет функцию к каждому элементу стрима
    collection.stream().map(String::toUpperCase).peek((e) -> System.out.print("," + e)).collect(Collectors.toList())
        //limit	Позволяет ограничить выборку определенным количеством первых элементов
        collection.stream().limit(2).collect(Collectors.toList())
        //sorted	Позволяет сортировать значения либо в натуральном порядке, либо задавая Comparator
        collection.stream().sorted().collect(Collectors.toList())
    //    mapToInt, mapToDouble, mapToLong	Аналог map, но возвращает числовой стрим (то есть стрим из числовых примитивов)
    collection.stream().mapToInt((s) -> Integer.parseInt(s)).toArray()
        //flatMap, flatMapToInt, flatMapToDouble, flatMapToLong	Похоже на map, но может создавать из одного элемента несколько
        collection.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new)
        System.out.println(list);

    }
}
