package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

import java.util.Arrays;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Solution
{
    public static void main(String[] args)
    {
        int[][] arr = new int [11][11];
        int i;
        int j;

        for (i = 1; i <= 10; ++i)
        {
            for (j = 1; j <= 10; ++j)
            {
                arr[i][j] = i * j;
                System.out.print(arr[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
