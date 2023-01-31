package ml.pevgen.algo.hackerrank.w1.d1;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:40:22AM"));
        System.out.println(timeConversion("06:40:03AM"));
        System.out.println(timeConversion("12:45:54PM"));

    }

    public static String timeConversion(String timeAsString) {
        String timeType = timeAsString.substring(8);
        int hours = Integer.parseInt(timeAsString.substring(0, 2));
        if ("PM".equals(timeType)) {
            if (hours != 12) {
                hours = hours + 12;
            }
            return String.format("%02d", hours) + timeAsString.substring(2, 8);
        }

        if ("AM".equals(timeType) && hours == 12) {
            hours = 0;
            return String.format("%02d", hours) + timeAsString.substring(2, 8);
        }
        return timeAsString.substring(0, 8);
    }
}
