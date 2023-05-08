package ml.pevgen.algo.hackerrank.problems;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * <a href="https://www.hackerrank.com/challenges/day-of-the-programmer/problem">
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem</a>
 */
public class DayOfTheProgrammer {

    public String dayOfProgrammer(int year) {
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        int days9monthNoLeapYear = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        if (year == 1918) {
            days9monthNoLeapYear = days9monthNoLeapYear + 1 - 14;
        } else if (((year <= 1917) && (year % 4 == 0))
                || ((year > 1918) && isGregorianLeap(year))) {
            days9monthNoLeapYear = days9monthNoLeapYear + 1;
        }
        int dateOfSeptember = 256 - days9monthNoLeapYear;

        return formattedDate.format(LocalDate.of(year, Month.SEPTEMBER, dateOfSeptember));
    }

    boolean isGregorianLeap(int year) {
        return (year % 400 == 0)
                || ((year % 4 == 0) && (year % 100 != 0));
    }
}
