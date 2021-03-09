package validparams;

public class Date {
    int day;
    int month;
    int year;
    long weekdays;


    public Date(int day, int month, int year, long weekdays) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.weekdays = weekdays;
        //OTHER  Objects.requireNonNull(HOLYDAY, "bar must not be null");
    }
    
    

    public int getDay() {
        return this.day;
    }
    /**
     * Set month's day
     * @param day must between 1-32
     * @throws IllegalArgumentException  if day<1 || day>31
     */
    public void setDay(int day) {
        if(day<1 || day>31){
            throw new IllegalArgumentException("day"+day+" must be between 1-32");
        }
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public long getWeekdays() {
        return this.weekdays;
    }

    public void setWeekdays(long weekdays) {
        this.weekdays = weekdays;
    }

    @Override
    public String toString() {
        return "{" +
            " day='" + getDay() + "'" +
            ", month='" + getMonth() + "'" +
            ", year='" + getYear() + "'" +
            ", weekdays='" + getWeekdays() + "'" +
            "}";
    }


}
