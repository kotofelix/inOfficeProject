/*
Создать класс Cat, с свойствами количество лет, цвет глаз, вес и цвет шерсти.
Создать максимально возможное количество конструкторов,
создать котиков в методе Main и вывести на их экран. Не забываем про метод toString() для котов.
 */

package HwMethodAndIncapsulation;

public class Cat {
    int age; //возраст кошки
    String eyeColor; //цвет глаз
    String woolColor; // цвет шерсти
    double weight; // вес кошки

    public Cat() {
    }

    Cat(String woolColor, int age) {
        this.age = age;
        this.woolColor = woolColor;
    }

    Cat(String woolColor) {
        this.woolColor = woolColor;
    }

    Cat(int age, double weight, String eyeColor, String woolColor) {
        this.age = age;
        this.weight = age;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    Cat(double weight, int age, String eyeColor, String woolColor) {
        this.age = age;
        this.weight = age;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

   /* конструктор ниже с точки зрения Джавы одинаковый с конструктором выше т.к
   на вход идёт два String и он не знает к какому String даётся это значение
   */

   //   Cat(double weight, int age, String woolColor, String eyeColor){
   //       this.age = age;
   //       this.weight = age;
   //       this.eyeColor = eyeColor;
   //       this.woolColor = woolColor;
   //   }

    Cat(String eyeColor, double weight, int age, String woolColor) {
        this.age = age;
        this.weight = age;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    //  Cat(String woolColor, double weight, int age, String eyeColor){
    //      this.age = age;
    //      this.weight = age;
    //      this.eyeColor = eyeColor;
    //      this.woolColor = woolColor;
    //  }

    Cat(double weight, String eyeColor, String woolColor, int age) {
        this.age = age;
        this.weight = age;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    Cat(String eyeColor, String woolColor) {
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    Cat(double weight, String eyeColor, String woolColor) {
        this.weight = age;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    Cat(int age, String eyeColor, String woolColor) {
        this.age = age;
        this.eyeColor = eyeColor;
        this.woolColor = woolColor;
    }

    Cat(int age, String woolColor) {
        this.age = age;
        this.woolColor = woolColor;
    }

    public String toString() {
        return "возраст кошки: " + age +
                "\nцвет глаз: " + eyeColor +
                "\nцвет шерсти: " + woolColor +
                "\nвес кошки: " + weight;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat(4.3, 2, "blue", "3color");
        Cat cat2 = new Cat(7, "green", "white");
        Cat cat3 = new Cat(4, "mramor");
        Cat cat4 = new Cat("gray", 7);
        Cat cat5 = new Cat("black");
        Cat cat6 = new Cat(4.2, "green", "white");
        Cat cat7 = new Cat("blue", "white");
        Cat cat8 = new Cat();
        Cat cat9 = new Cat(5, "black", "redhead");

        System.out.println(cat1);
        System.out.println();
        System.out.println(cat2);
        System.out.println();
        System.out.println(cat3);
        System.out.println();
        System.out.println(cat4);
        System.out.println();
        System.out.println(cat5);
        System.out.println();
        System.out.println(cat6);
        System.out.println();
        System.out.println(cat7);
        System.out.println();
        System.out.println(cat8);
        System.out.println();
        System.out.println(cat9);
    }
}


