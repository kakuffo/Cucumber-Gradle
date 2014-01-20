package com.whiteleys.zoo.web;

import org.joda.time.LocalDate;

import java.util.*;

/**
 * Useful global variables and methods for the web tier.
 */
public final class Globals {

    /**
     * Days of the month, spanning 1 to 31.
     */
    public static final List<Integer> DAYS_OF_MONTH =
            Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                    20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31});

    /**
     * A map of month as an integer to an English representation (eg, 1 -&gt; "January").
     */
    public static final Map<Integer, String> MONTHS_OF_YEAR = new HashMap<Integer, String>();
    static {
        MONTHS_OF_YEAR.put(0, "January");
        MONTHS_OF_YEAR.put(1, "February");
        MONTHS_OF_YEAR.put(2, "March");
        MONTHS_OF_YEAR.put(3, "April");
        MONTHS_OF_YEAR.put(4, "May");
        MONTHS_OF_YEAR.put(5, "June");
        MONTHS_OF_YEAR.put(6, "July");
        MONTHS_OF_YEAR.put(7, "August");
        MONTHS_OF_YEAR.put(8, "September");
        MONTHS_OF_YEAR.put(9, "October");
        MONTHS_OF_YEAR.put(10, "November");
        MONTHS_OF_YEAR.put(11, "December");       
    }



    /**
     * The maximum age of a person entering their birth date, set to 100.
     */
    public static final Integer USER_MAX_AGE = 100;

    /**
     * @return a list of years, spanning from 99 years ago to the current year
     */
    public static List<Integer> birthYears() {

        Integer[] years = new Integer[USER_MAX_AGE];
        int year = new LocalDate().getYear();

        for (int i = 0; i < years.length; i++) {
            years[i] = year--;
        }

        return  Arrays.asList(years);
    }
}
