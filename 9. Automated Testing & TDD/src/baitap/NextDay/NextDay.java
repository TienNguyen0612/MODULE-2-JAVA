package baitap.NextDay;

public class NextDay {
    public static String findNextDay(int day, int month, int year) {
        boolean monthOfDay31 = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
        boolean monthOfDay30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean monthFebOfLeapYear = month == 2 && isLeapYear(year);
        boolean monthFebNotOfLeapYear = month == 2 && !isLeapYear(year);
        boolean dayThirtyOne = day == 31 && monthOfDay31;
        boolean dayThirty = day == 30 && monthOfDay30;
        boolean validateInput = day < 1 || (day > 30 && monthOfDay30) || (day > 31 && monthOfDay31 || month < 1 || month > 12);
        if (validateInput) {
            return "Out of range !!!";
        } else {
            if (!isLeapYear(year) && month == 2 && day > 28) {
                return "Don't have this day !!!";
            } else if (isLeapYear(year) && month == 2 && day > 29) {
                return "Don't have this day !!!";
            } else if (dayThirtyOne || dayThirty || monthFebOfLeapYear || monthFebNotOfLeapYear) {
                return 1 + "/" + (month + 1) + "/" + year;
            } else if (day == 31 && month == 12) {
                return 1 + "/" + 1 + "/" + (year + 1);
            }
            return (day + 1) + "/" + month + "/" + year;
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
