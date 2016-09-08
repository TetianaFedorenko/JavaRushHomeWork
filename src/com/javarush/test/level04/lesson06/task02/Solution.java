package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        String d = reader.readLine();
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int n3 = Integer.parseInt(c);
        int n4 = Integer.parseInt(d);
        if (n1 > n2 && n1 > n3 && n1 > n4)
            System.out.println(n1);
        else if (n2 > n1 && n2 > n3 && n2 > n4)
            System.out.println(n2);
        else if (n3 > n1 && n3 > n2 && n3 > n4)
            System.out.println(n3);
        else if (n4 > n1 && n4 > n2 && n4 > n3)
            System.out.println(n4);
    }
}
