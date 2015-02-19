/**
 * Created by John Paul San Pedro on 2/9/2015.
 */
public class Date {
    private int day,
            month,
            year;

    public Date() {
        setMonth(1);
        setDay(1);
        setYear(2015);
    }

    public Date(int month, int day) {
        setMonth(month);
        setDay(day);
        setYear(2015);
    }

    public boolean isBefore(Date date) {
        if (this.month < date.getMonth())
            return true;

        if (this.month == date.getMonth()) {
            return true;
        }
        if (this.month == date.getMonth()) {
            if (this.day < date.getDay())
                return true;
        }

        return false;
    }

    public boolean isValidDay() {
        boolean leap = this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0;
        if (leap) {
            return getMonth() == 2 && getDay() <= 29;
        }
        switch (getMonth()) {
            case 2:
                return getDay() <= 28;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return getDay() <= 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return getDay() <= 30;
        }

        return false;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

//    public void setMonth(String month) {
//        switch (month) {
//            case "January":
//                this.month = 1;
//                break;
//            case "February":
//                this.month = 2;
//                break;
//            case "March":
//                this.month = 3;
//                break;
//            case "April":
//                this.month = 4;
//                break;
//            case "May":
//                this.month = 5;
//                break;
//            case "June":
//                this.month = 6;
//                break;
//            case "July":
//                this.month = 7;
//                break;
//            case "August":
//                this.month = 8;
//                break;
//            case "September":
//                this.month = 9;
//                break;
//            case "October":
//                this.month = 10;
//                break;
//            case "November":
//                this.month = 11;
//                break;
//            default:
//                this.month = 12;
//        }
//    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
