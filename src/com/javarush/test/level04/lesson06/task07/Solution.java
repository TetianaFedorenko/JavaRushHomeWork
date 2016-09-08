package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        int a = Integer.parseInt(s1);
        String s2 = reader.readLine();
        int b = Integer.parseInt(s2);
        String s3 = reader.readLine();
        int c = Integer.parseInt(s3);
        /*String s = s1+s2+s3;
        if (a == b)
            System.out.println(s.indexOf(s3));
        else if (a == c)
            System.out.println(s.indexOf(s2));
        else if (b == c)
            System.out.println(s.indexOf(s1));*/

        if (a != b && a != c)
            System.out.println("1");
        if (b != a && b != c)
            System.out.println("2");
        if (c != a && c != b)
            System.out.println("3");

        }

    }

