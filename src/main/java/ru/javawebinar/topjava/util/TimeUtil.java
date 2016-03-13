package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.UserMeal;

import java.time.LocalTime;
import java.util.List;

/**
 * GKislin
 * 07.01.2015.
 */
public class TimeUtil {
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }

    public static boolean isExceed(List<UserMeal> userMealList, int currentIteration, int maxcalories) {
        int calories = 0;
        int end = currentIteration + 2;
        for (int i = currentIteration; i <= end; i++) {
            calories += userMealList.get(i).getCalories();
        }
        return calories > maxcalories;

    }
}
