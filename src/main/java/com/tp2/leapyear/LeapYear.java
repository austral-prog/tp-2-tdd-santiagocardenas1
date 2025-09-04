package com.tp2.leapyear;

public class LeapYear {

    public static boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(year + " ¿es bisiesto? " + isLeap(year));
    }
}
