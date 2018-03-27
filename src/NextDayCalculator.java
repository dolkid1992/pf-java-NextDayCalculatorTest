public class NextDayCalculator {
    public static String date(int day, int month, int year) {
        int top = 0;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                top = 30;
                break;
            case 2:
                top = (year%4==0 && year%100==0 || year%400 ==0) ? 28 : 29;
                break;
            default:
                top = 31;
        }
        if (day == top) {
            day = 1;
            if (month == 12) {
                month = 1;
                year += 1;
            } else month = month + 1;
        } else day = day + 1;
        return day + "-" + month + "-" + year;
    }

}

