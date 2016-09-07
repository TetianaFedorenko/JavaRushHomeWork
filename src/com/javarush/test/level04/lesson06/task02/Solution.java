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
        int m = 0;
        int p = 0;
        if (n1 > n2)
        {
            m = n1;
            if (m > n3 && m > n4)
                System.out.println(m);
            else;
        }
        else if (n2 > n1)
        {
            p = n2;
            if (p > n3 && p > n4)
                System.out.println(p);
            else;
        }
        else if (n3 > n4)
            System.out.println(n3);
        else
            System.out.println(n4);




    }
}
