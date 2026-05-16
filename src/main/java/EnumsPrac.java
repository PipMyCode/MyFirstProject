public class EnumsPrac {
    public static void main(String[] args) {
        // Enums = (Enumeration) A special kind of class that
        //          represents a fixed set of constants.
        //          They improve code readability and maintainability.
        //             More efficient with switches when comparing Strings.

        Day day = Day.THURSDAY;

        switch (day) {
            case MONDAY,
                 TUESDAY,
                 WEDNESDAY,
                 THURSDAY,
                 FRIDAY -> System.out.println("It is a weekday");

            case SATURDAY -> System.out.println("It is the weekend");

        }
    }
}
