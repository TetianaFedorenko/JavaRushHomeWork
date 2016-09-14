package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/


public class Solution
{
    public static void main(String[] args)
    {
        Human granny1 = new Human("Kate", false, 65, null, null);
        Human granny2 = new Human("Lala", false, 62, null, null);
        Human grF1 = new Human("Jack", true, 65, null, null);
        Human grF2 = new Human("John", true, 63, null, null);
        Human father = new Human("Bill", true, 40, grF1, granny1);
        Human mother = new Human("Margo", false, 39, grF2, granny2);
        Human son1 = new Human("Ron", true, 15, father, mother);
        Human son2 = new Human("Rob", true, 14, father, mother);
        Human daughter = new Human("Lila", false, 8, father, mother);
        System.out.println(granny1.toString());
        System.out.println(granny2.toString());
        System.out.println(grF1.toString());
        System.out.println(grF2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
    }

    public static class Human
    {
        String name;
        Boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
