package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> arr = new ArrayList<>();
        arr.add(new int[]{5, 25, 547, 45, 8});
        arr.add(new int[]{41, 36});
        arr.add(new int[]{45, 25, 65, 14});
        arr.add(new int[]{51, 254, 47, 4, 81, 42, 96});
        arr.add(new int[]{});
        return arr;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
