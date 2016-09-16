package com.javarush.test.level08.lesson11.home02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats()
    {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();

        HashSet<Cat> result = new HashSet<Cat>();
        result.add(cat1);
        result.add(cat2);
        result.add(cat3);
        result.add(cat4);
        System.out.println("Cats: " + result);

        return result;
    }

    public static Set<Dog> createDogs()
    {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        HashSet<Dog> dogHashSet = new HashSet<>();
        dogHashSet.add(dog1);
        dogHashSet.add(dog2);
        dogHashSet.add(dog3);
        System.out.println("Dogs: " + dogHashSet);

        return dogHashSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs)
    {
        HashSet<Object> petSet = new HashSet<>();
        for (Object c : cats) {
            petSet.add(c);
        }
        for (Object d : dogs) {
            petSet.add(d);
        }
        System.out.println("Pets: " + petSet);
        return petSet;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats)
    {
        for (Object catInPet : cats) {
            for (Iterator<Object> iterator = pets.iterator(); iterator.hasNext() ; ) {
                Object tmp = iterator.next();
                if (tmp.equals(catInPet)) {
                    iterator.remove();
                }
            }
        }
        System.out.println("New pets: " + pets);
    }

    public static void printPets(Set<Object> pets)
    {
        for (Object newPet : pets) {
            System.out.println(newPet);
        }
    }

    public static class Cat
    {
    }

    public static class Dog
    {

    }
}
