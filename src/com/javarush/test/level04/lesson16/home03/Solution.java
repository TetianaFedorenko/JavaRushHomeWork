package com.javarush.test.level04.lesson16.home03;

import java.io.*;
import java.util.Scanner;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (b == -1 || a == -1) {
            b = b+a;
            System.out.println(b);
        }



    }
}
