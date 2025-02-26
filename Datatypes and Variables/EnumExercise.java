

public class EnumExercise {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        Day today = Day.WEDNESDAY;

        switch(today) {
            case MONDAY:
                System.out.println("Today is Monday.");
                break;
            case WEDNESDAY:
                System.out.println("Today is Wednesday.");
                break;
            default:
                System.out.println("It's some other day.");
        }
    }
}



//OUTPUT**********************************

// Today is Wednesday.