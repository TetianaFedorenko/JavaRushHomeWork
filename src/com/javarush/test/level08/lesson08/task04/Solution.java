package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> list = createMap();
        removeAllSummerPeople(list);

    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 22 1989"));
        map.put("Sidorenko", new Date("JULY 1 1981"));
        map.put("Petrenko", new Date("AUGUST 24 1982"));
        map.put("Kovalenko", new Date("SEPTEMBER 15 1980"));
        map.put("Krasnenko", new Date("OCTOBER 16 1984"));
        map.put("Fedorenko", new Date("NOVEMBER 12 1988"));
        map.put("Petrov", new Date("DECEMBER 15 1987"));
        map.put("Sidorov", new Date("JANUARY 17 1980"));
        map.put("Krasnov", new Date("FEBRUARY 17 1986"));
        map.put("Popov", new Date("MARCH 15 1987"));
        return map;
        //напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                pair.getKey();
                iterator.remove();
            }
        }
    }
}
