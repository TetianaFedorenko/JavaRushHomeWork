package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    /*public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код

    }*/


    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        getCountTheSameFirstName(map, "Ваня");
        getCountTheSameLastName(map, "Сидоренко");
    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Петров", "Ваня");
        map.put("Федоров", "Вася");
        map.put("Петриченко", "Рита");
        map.put("Павлюченко", "Ваня");
        map.put("Сидоренко", "Саша");
        map.put("Потапенко", "Саша");
        map.put("Федоренко", "Катя");
        map.put("Шевченко", "Марина");
        map.put("Гунченко", "Карина");
        map.put("Жученко", "Сабрина");
        System.out.println(map);
        return map;
    }


    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext())
        {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name))
            {
                n++;
            }
        }
        System.out.println(n);
        return n;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int m = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(lastName)) {
                m++;
            }
        }
        System.out.println(m);
        return m;
    }
}
