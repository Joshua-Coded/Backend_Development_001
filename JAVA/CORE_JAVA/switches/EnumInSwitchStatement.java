public class EnumInSwitchStatement {
    public static void main(String[] args) {
        System.out.println(enumInSwitch(Days.SUNDAY));
    }

    enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    public static String enumInSwitch(Days day) {
        switch (day) {
            case SUNDAY:
                return "It's SUNDAY";
            case MONDAY:
                return "It's MONDAY";
            case TUESDAY:
                return "It's TUESDAY";
            case WEDNESDAY:
                return "It's WEDNESDAY";
            default:
                return "Rest of the week........";
        }
    }
}