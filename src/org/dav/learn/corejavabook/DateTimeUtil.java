package org.dav.learn.corejavabook;

import java.time.LocalDate;

public class DateTimeUtil
{
    public static final int MAX_DAY_OF_YEAR = 366;

    public static LocalDate getLocalDate(int year, long dayOfYear)
    {
        if (dayOfYear > MAX_DAY_OF_YEAR)
            throw new IllegalArgumentException("The day of the year has to be between 1 and " + MAX_DAY_OF_YEAR);

        return LocalDate.of(year, 1, 1).plusDays(dayOfYear - 1);
    }
}
