package workout;

public class BasicWorkout {

    protected Date date;
    protected String description;
    protected int duration;
    protected int intensity;
    protected int energy;


    public BasicWorkout(Date date, int duration, int intensity, int energy, String description) {
        this.date = date;
        this.description = description;
        this.duration = duration;
        this.intensity = intensity;
        this.energy = energy;
    }

    public BasicWorkout(Date date, int duration,  int intensity, int energy) {
        this.date = date;
        this.duration = duration;
        this.intensity = intensity;
        this.energy = energy;
    }

    public BasicWorkout(Date date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getIntensityString() {
        String s = "";
        for (int i = 1; i <= getIntensity(); i++) {
            s += "*";
        }
        return s;
    }

    @Override
    public String toString() {
        return String.format("%s: [%-10s] \"%s\" %.1fh, %dkcal ",
                date, getIntensityString(), getDescription(), duration/3600., getEnergy());
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
