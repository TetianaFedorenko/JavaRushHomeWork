package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int n = 0;
        int b = 0;
        int c = 0;
        int maximum = 0;
        while (n != a)
        {
            c = Integer.parseInt(reader.readLine());
            if (c > b)
            {
                maximum = c;
                System.out.println(maximum);
                b = c;
            } else
            {
                maximum = b;
            }
            n++;
        }
        //int maximum =
        System.out.println(maximum);*/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        {
            String m = reader.readLine();
            int n = Integer.parseInt(m);
            if (n > 0)
            {
                //BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
                int maximum = -2147483648;
                for (int a = 1; a <= n; a++)
                {
                    String m2 = reader.readLine();
                    int n2 = Integer.parseInt(m2);
                    if (n2>maximum) maximum = n2;
                }
                System.out.println(maximum);
            }
            else
            {
                //  System.out.println("Ввведите число больше нуля");
            }
        }
    }
}
