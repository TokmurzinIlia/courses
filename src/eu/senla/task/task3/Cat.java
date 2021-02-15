package eu.senla.task.task3;

import java.util.Objects;

public class Cat {
    String catName = "Murzik";

    int catAge = 15;



    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }
    //Цикл While
    void CatWhile (){
    int catNumber = 0;
    while (catNumber < 10){
        Cat cat = new Cat("Bobik",5);
        System.out.println(cat);
        catNumber++; }

    }
// Цикл For
    void CatFor (){
   /*     //1
        Cat Barsik = new Cat();
        Barsik.setCatName("Barsik");
        Barsik.setCatAge(10);
        Cat Vasia = new Cat();
        //2
        Vasia.setCatName("Vasia");
        Vasia.setCatAge(5);

        //3
        Cat Nika = new Cat();
        Nika.setCatName("Nika");
        Nika.setCatAge(2);

        //4
        Cat Petia = new Cat();
        Petia.setCatName("Petia");
        Petia.setCatAge(9);

        //5
        Cat Sharik = new Cat();
        Sharik.setCatName("Sharik");
        Sharik.setCatAge(8);

        //6
        Cat Tuzik = new Cat();
        Tuzik.setCatName("Tuzik");
        Tuzik.setCatAge(1);

        //7
        Cat Simba = new Cat();
        Simba.setCatName("Simba");
        Simba.setCatAge(10);

        //8
        Cat Murka = new Cat();
        Murka.setCatName("Murka");
        Murka.setCatAge(9);

        //9
        Cat Ray = new Cat();
        Ray.setCatName("Ray");
        Ray.setCatAge(16);

        //10
        Cat Lysia = new Cat();
        Lysia.setCatName("Lysia");
        Lysia.setCatAge(16);

    */
   for (int i = 0;i < 10 ;i++){
       Cat cat = new Cat("Vaska",23);
       setCatName("Barsik");
       setCatAge(2);
            System.out.println("Cat name: " + getCatName() + " Cat age: " + getCatAge());
        }
    }

// Цикл do {} while {}
    String name;
    int age;
    public  Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    void CatDoWhile (){
        int i = 0;
        do {
            Cat cat = new Cat("Gorgii", 4);
            System.out.println(cat);
        i++;
        } while (i < 10);

       }

    @Override
    public String toString() {
        return
                "Cat name:" + name  +
                ". Cat age:" + age +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return catAge == cat.catAge &&
                age == cat.age &&
                catName.equals(cat.catName) &&
                name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catName, catAge, name, age);
    }

    //Цикл For-each
    void CatForEach () {

        Cat Barsik = new Cat("Barsik",2);

        Cat Barsik1 = new Cat("Barsik",2);

        Cat Vasia = new Cat("Vasia", 5);

        Cat Nika = new Cat("Nika",6);

        Cat Petia = new Cat("Petia",12);

        Cat Sharik = new Cat("Sharik", 6);

        Cat[] cats = new Cat[]{Barsik,Vasia,Nika,Petia,Sharik};
        for (Cat cat : cats){
            System.out.println(cat);

        }
        System.out.println(Barsik.equals(Barsik1));
        System.out.println(Barsik.equals(Nika));
    }

}
