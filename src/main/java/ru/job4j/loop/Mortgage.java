package ru.job4j.loop;

import ru.job4j.condition.SwitchWeek;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;

        while (amount + amount * percent / 100 > salary) {
            year++;
            amount = amount + amount * percent / 100 - salary;
        }
        return year;
    }
}
