package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human daughter = new Human("Kate", false, 10, new ArrayList<Human>());
        Human daughter2 = new Human("Lala", false, 12, new ArrayList<Human>());
        Human son = new Human("Bill", true, 11, new ArrayList<Human>());
        ArrayList<Human> childrenList = new ArrayList<>();
        childrenList.add(daughter);
        childrenList.add(daughter2);
        childrenList.add(son);

        Human mother = new Human("Varya", false, 40, childrenList);
        ArrayList<Human> motherList = new ArrayList<>();
        motherList.add(mother);
        Human father = new Human("Alex", true, 42, childrenList);
        ArrayList<Human> fatherList = new ArrayList<>();
        fatherList.add(father);

        Human granny1 = new Human("Karina", false, 65, motherList);
        Human grandfather1 = new Human("Jack", true, 66, motherList);

        Human granny2 = new Human("Polina", false, 63, fatherList);
        Human grandfather2 = new Human("John", true, 64, fatherList);

        System.out.println(granny1);
        System.out.println(grandfather1);
        System.out.println(granny2);
        System.out.println(grandfather2);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(daughter);
        System.out.println(daughter2);
        System.out.println(son);
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }


}
