package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        String lastName;
        String sex;
        int age;
        String address;
        double salary;

        public Human(String name, String lastName, double salary)
        {
            this.name = name;
            this.lastName = lastName;
            this.salary = salary;
        }

        public Human(String name, String lastName, String sex)
        {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName)
        {
            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, int age, double salary)
        {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
        }

        public Human(String name, String lastName, String sex, int age, String address, double salary)
        {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.address = address;
            this.salary = salary;
        }

        public Human(String lastName, int age, String address)
        {
            this.lastName = lastName;
            this.age = age;
            this.address = address;
        }

        public Human(int age, double salary)
        {
            this.age = age;
            this.salary = salary;
        }

        public Human(double salary, String lastName)
        {
            this.salary = salary;
            this.lastName = lastName;
        }

        public Human(double salary, String address, String lastName)
        {
            this.salary = salary;
            this.address = address;
            this.lastName = lastName;
        }
    }
}
