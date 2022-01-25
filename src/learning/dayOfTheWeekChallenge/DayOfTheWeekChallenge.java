package learning.dayOfTheWeekChallenge;

public class DayOfTheWeekChallenge {

    public static void main(String[] args) {

    }

    private static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    private static void printMyValue(int dayValue) {
        if (dayValue == 0) {
            System.out.println("Sunday");
        } else if (dayValue == 1) {
            System.out.println("Monday");
        } else if (dayValue == 2) {
            System.out.println("Tuesday");
        } else if (dayValue == 3) {
            System.out.println("Wednesday");
        } else if (dayValue == 4) {
            System.out.println("Thursday");
        } else if (dayValue == 5) {
            System.out.println("Friday");
        } else if (dayValue == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
