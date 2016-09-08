package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;

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
        /*int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        for (int i = arr.length - 1; i >=0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        */

        if (c>=b && b>=a) System.out.println(c + " " + b + " " + a);
        else if (b>=c && c>=a) System.out.println(b + " " + c + " " + a);
        else if (a>=c && c>=b) System.out.println(a + " " + c + " " + b);
        else if (c>=a && a>=b) System.out.println(c + " " + a + " " + b);
        else if (b>=a && a>=c) System.out.println(b + " " + a + " " + c);
        else if (a>=b && b>=c) System.out.println(a + " " + b + " " + c);
    }
}
