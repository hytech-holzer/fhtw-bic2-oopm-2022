package workout;

public class Running extends BasicWorkout {

    private int distance;

    public Running(Date date, int duration, int distance, String description) {
        super(date, duration, 0, 0, description);
        this.distance = distance;
    }

    @Override
    public int getIntensity() {
        double pace = (duration/60) / (distance/1000);
        if (pace < 3) {
            return 10;
        }
        if (pace < 4) {
            return 9;
        }
        if (pace < 5) {
            return 8;
        }
        if (pace < 6) {
            return 7;
        }
        if (pace < 7) {
            return 6;
        }
        if (pace < 8) {
            return 5;
        }
        if (pace < 9) {
            return 4;
        }
        if (pace < 10) {
            return 3;
        }
        if (pace < 11) {
            return 2;
        }
        return 1;

    }

    @Override
    public String toString() {
        return String.format("%s %.1fkm", super.toString(), distance / 1000.);
    }
}
