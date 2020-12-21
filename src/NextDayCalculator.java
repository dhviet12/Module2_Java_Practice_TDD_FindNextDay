public class NextDayCalculator {
    final static int FIRST_DAY_OF_MONTH = 1;
    final static int FIRST_MONTH = 1;
    public static String findNextDay(int day, int month, int year) {
        String result;
        if (checkValidDay(day, month, year)){
            result = nextDay(day, month, year);
        } else {
            result = "Invalid date";
        }
        return result;
    }

    public static String nextDay(int inputDay, int inputMonth, int inputYear) {
        boolean isEndDayOfYear = (inputDay == lastDayOfMonth(inputMonth, inputYear)) && (inputMonth ==12);
        boolean isEndDayOfMonth = inputDay == lastDayOfMonth(inputMonth, inputYear);

        if (isEndDayOfYear) {
            inputYear ++;
            inputMonth = FIRST_MONTH;
            inputDay = FIRST_DAY_OF_MONTH;
        }
        else if (isEndDayOfMonth) {
            inputMonth ++;
            inputDay = FIRST_DAY_OF_MONTH;
        }
        else {
            inputDay ++;
        }

        return inputDay+"-"+inputMonth+"-"+inputYear ;
    }

    public static boolean checkValidDay(int day, int month, int year){
        boolean isValidDate = false;
        boolean isValidYear = (year > 0);
        boolean isValidMonth = (month > 0 && month <=12);
        boolean isValidDay = (day >0 && day <= lastDayOfMonth(month,year));
        if( isValidDay && isValidMonth && isValidYear)
            isValidDate=true;
        return isValidDate;
    }

    public static int lastDayOfMonth(int month, int year) {
        int day = 0;

        boolean isLeafYear = (isDivisible(year, 400) || (isDivisible(year, 4) && isNotDivisible100(year)));

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 2:
                if (isLeafYear){
                    day = 29;
                } else {
                    day = 28;
                }
                break;
        }

        return day;
    }

    private static boolean isNotDivisible100(int year) {
        return year % 100 != 0;
    }

    private static boolean isDivisible(int year, int i) {
        return year % i == 0;
    }
}