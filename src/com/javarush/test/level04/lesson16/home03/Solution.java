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
        //int sum = 0;
        //Scanner sc = new Scanner(System.in);
        /*while (true) {
            int a = sc.nextInt();
            if (a == -1)
            {
                sum = sum + a;
                System.out.println(sum);
                break;
            }
            else
            sum = sum + a;
            System.out.println(sum);*/
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int s = 0;
            int d = 0;
            while (s!=-1)
            {

                String str = reader.readLine();
                s = Integer.parseInt(str);
                d = s + d;
            }
            System.out.print(d);

        }
    }

