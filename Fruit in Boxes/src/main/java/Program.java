import java.util.ArrayList;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */

    public static void main(String[] args) {
        Apple apple = new Apple();

        Orange orange = new Orange();

        //Коробка я блоками 1
        Box box1 = new Box();
        box1.addFruit(apple);
        box1.addFruit(apple);
        box1.addFruit(apple);
        //Коробка я блоками 2
        Box box2 = new Box();
        box2.addFruit(apple);
        box2.addFruit(apple);
        box2.addFruit(apple);

        //Коробка с апельсинами 1
        Box box3 = new Box<>();
        box3.addFruit(orange);
        box3.addFruit(orange);
        box3.addFruit(orange);
        box3.addFruit(orange);
        //Коробка с апельсинами 2
        Box box4 = new Box<>();
        box4.addFruit(orange);
        box4.addFruit(orange);

        System.out.println("Метод, который пересыпает фрукты из одного ящика в другой");
        //Подсчет веса ящика
        System.out.println("Было");
        box1.getWeight();
        box2.getWeight();
        //Метод, который пересыпает фрукты из одного ящика в другой
        box1.sprinkleFruit(box2);
        //Подсчет весf ящика
        System.out.println("Стало");
        box1.getWeight();
        box2.getWeight();


        System.out.println();
        System.out.println("***");
        System.out.println();

        System.out.println("Метод сравнения веса ящиков");
        //Сравним бокс1, в котором 6 яблок по 1 кг и бокс3, в котором 4 апельсина 1.5 кг.
        System.out.println("Ящики №1 и №3");
        System.out.println(box1.compare(box3));
        //Так же сравним бокс 1 и бокс 4, в котором 2 апельсина
        System.out.println("Ящики №1 и №4");
        System.out.println(box1.compare(box4));
    }

}
