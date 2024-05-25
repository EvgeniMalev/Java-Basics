public class PrintHours {
    public static void main(String[] args) {
        printHoursOfDay();
    }

    public static void printHoursOfDay() {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + ":" + minute);
            }
        }
    }
}

