package TimeConverter;

class TimeConverter<SECONDS_IN_MINUTE> {

    private int seconds;
    private int minutes;
    private int hours;

    private final int SECONDS_IN_MINUTE = 60;

    TimeConverter(int seconds) {
        this.seconds = seconds;
        this.toTime(seconds);
    }

    private int[] toTime(int seconds) {
        minutes = (seconds / 60);
        hours = (minutes / 60);

        /*
        * In order to prevent the minute counter from exceeding 59,
        * we must loop over the total amount of minutes and
        * subtract 60 until the final minutes are under 60.
        */
        while (minutes >= SECONDS_IN_MINUTE) {
            minutes = minutes - SECONDS_IN_MINUTE;
        }

        /*
        * A return statement cannot return more than one value,
        * thus we added the two values we need into an array
        * in order to return the calculated values.
        */
        int[] time = new int[2];
        time[0] = hours;
        time[1] = minutes;

        return time;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
