package com.javarush.test.level04.lesson13.task01;

/* Четные числа
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/

import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 1; i <= 100; i++) {
            if (i%2 == 0)
            System.out.print(i + " ");
        }
    }
}