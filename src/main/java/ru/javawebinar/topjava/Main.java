package ru.javawebinar.topjava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: gkislin
 * Date: 05.08.2015
 *
 * @link http://caloriesmng.herokuapp.com/
 * @link https://github.com/JavaOPs/topjava
 */
public class Main {
    public static void main(String[] args) {
//        checkDates();
        List<String> strList = new ArrayList<>();
        strList.add("rama");
        strList.add("panama");
        strList.add("water");
        strList.add("allies");
        strList.add("mother");

        strList.stream().sorted(String::compareTo).filter(s -> s.length() > 5).forEach(System.out::println);
        System.out.println();

//        long count =
        strList.stream().sorted().map(String::length)
//                .count();
                .forEachOrdered(System.out::println);
//        System.out.println(count);

        Map<String, String> mapStr = new HashMap<>();
        mapStr.put("A", "ararat");
        mapStr.put("B", "fara");
        mapStr.put("C", "car");
        mapStr.forEach((s, s2) -> System.out.print("key = " + s + ", value = " + s2 + "\n"));

        mapStr.computeIfPresent("B", (s, s2) -> s2 + "updated");
//        mapStr.put("B", "newString");

        //merge old value with new value
        mapStr.merge("C", "Ford", (s, s2) -> s = s + "newValue");
        System.out.println(mapStr);

        //add new Value to all value in map
        mapStr.replaceAll((s, s2) -> s2 = "PutinHuylo!");
        System.out.println(mapStr);


    }

    private static void checkDates() {
        LocalDate localDate = LocalDate.now();//current date
        System.out.println(localDate);

        LocalDate localDateOf = LocalDate.of(2016, 3, 13);//custom date
        System.out.println(localDateOf);

        LocalDate localDateOfYear = LocalDate.ofYearDay(2016, 70);//date on days counting from the beginning of the year
        System.out.println(localDateOfYear);


        LocalTime localTime = LocalTime.now();//current time, can set TimeZone
        System.out.println(localTime);

        LocalTime localTimeOf = LocalTime.of(23, 45);//cutsom time
        System.out.println(localTimeOf);


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
