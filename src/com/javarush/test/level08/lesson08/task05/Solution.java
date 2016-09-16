package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> list = createMap();
        removeTheFirstNameDuplicates(list);

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
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String,String> copy = new HashMap<String, String>(map);
        //поиск соответствий имени в оригинальном ХэшМап
        for (Map.Entry<String, String> pair: copy.entrySet()) {
            //удаление элементов из оригинала, которые совпадают по НЕуникальному имени и НЕ совпадают по уникальному ключу
            for (Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator(); iter.hasNext(); ) {
                Map.Entry<String, String> temp = iter.next();
                if (pair.getValue().equals(temp.getValue())&&!pair.getKey().equals(temp.getKey())) iter.remove();
            }
        }
    }

    /*public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }*/
}
