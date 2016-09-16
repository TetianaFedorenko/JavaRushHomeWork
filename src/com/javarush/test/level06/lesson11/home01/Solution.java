package com.javarush.test.level06.lesson11.home01;

/* Класс Cat и статическая переменная catCount
В классе Cat создай статическую переменную public int catCount.
Создай конструктор [public Cat()]. Пусть при каждом создании кота (нового объекта Cat) статическая переменная
catCount увеличивается на 1. Создать 10 объектов Cat и вывести значение переменной catCount на экран.
*/

import com.javarush.test.level04.lesson02.task02.Cat;

public class Solution
/*{
    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
        }

        System.out.println(Cat.count);  // Выведи на экран catCount тут
    }
    public static class Cat
    {
        public static int count = 0; //Cоздай статическую переменную тут

        public Cat(){ //пустой конструктор который только считает кошаков
            Cat.count++;
        }                   //создай конструктор тут
    }
}*/

{
    public static void main(String[] args)
    {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        Cat c5 = new Cat();
        Cat c6 = new Cat();
        Cat c7 = new Cat();
        Cat c8 = new Cat();
        Cat c9 = new Cat();
        Cat c10 = new Cat();
        System.out.println(Cat.catCount);
    }

    public static class Cat
    {
        public static int catCount;

        public Cat()
        {
            Cat.catCount++;
        }
    }
}


