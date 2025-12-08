package Task;

import java.time.LocalDate;

public class Calendar {

    private LocalDate date ;
    Boolean arrival;
    Boolean departure;
    Boolean available;
    Integer minNight;

    public Calendar(LocalDate date, Boolean arrival, Boolean departure, Boolean available, Integer minNight) {
        this.date = date;
        this.arrival = arrival;
        this.departure = departure;
        this.available = available;
        this.minNight = minNight;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getArrival() {
        return arrival;
    }

    public void setArrival(Boolean arrival) {
        this.arrival = arrival;
    }

    public Boolean getDeparture() {
        return departure;
    }

    public void setDeparture(Boolean departure) {
        this.departure = departure;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Integer getMinNight() {
        return minNight;
    }

    public void setMinNight(Integer minNight) {
        this.minNight = minNight;
    }

    @Override
    public String toString() {
        return "Calender{" +
                "date=" + date +
                ", arrival=" + arrival +
                ", departure=" + departure +
                ", available=" + available +
                ", minNight=" + minNight +
                '}';
    }
}
