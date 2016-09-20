package com.javarush.test.level08.lesson11.home09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        isDateOdd(s);
    }

    public static boolean isDateOdd(String date)
    {
        Date date1 = new Date(date);
        long currentDate = date1.getTime();
        date1.setMonth(0);
        date1.setDate(1);
        date1.setHours(0);
        date1.setMinutes(0);
        date1.setSeconds(0);
        long startDate = date1.getTime();
        System.out.println(currentDate);
        System.out.println(startDate);

        long msDay = 24 * 60 * 60 * 1000;
        long msDistance = currentDate - startDate;
        int dayCount = (int) (msDistance / msDay);

        System.out.println(dayCount);

        boolean d = true;
        if (dayCount % 2 == 0)
        {

            System.out.println(d);

        }
        else  {
            d = false;
            System.out.println(d);
        }
    return d;

    }
}
