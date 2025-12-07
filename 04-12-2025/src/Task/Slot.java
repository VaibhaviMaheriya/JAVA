package Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Slot {
    static Scanner sc = new Scanner(System.in);
    private List<Calendar> data = new ArrayList<>();

    public void insertData(LocalDate date, Boolean arrival, Boolean departure, Boolean available, Integer minNight) {
        data.add(new Calendar(date, arrival, departure, available, minNight));
    }

    public static List<String> availableSlots(List<Calendar> days) {
        List<Calendar> sorted = days.stream()
                .sorted(Comparator.comparing(Calendar::getDate))
                .collect(Collectors.toList());

        List<String> slots = new ArrayList<>();

        for (int i = 0; i < sorted.size(); i++) {
            LocalDate start = sorted.get(i).getDate();
            Integer startMin = sorted.get(i).getMinNight();

            if (startMin == null || startMin <= 0) startMin = 1;

            for (int j = i + 1; j < sorted.size(); j++) {
                LocalDate end = sorted.get(j).getDate();

                long nights = java.time.temporal.ChronoUnit.DAYS.between(start, end);
                if (nights < startMin) continue; // not long enough for this start

                List<Calendar> period = sorted.subList(i, j + 1);
                boolean allAvailable = period.stream().allMatch(Calendar::getAvailable);

                if (allAvailable) {
                    slots.add(start + " → " + end);
                }
            }
        }

        return slots;
    }


    public static void main(String[] args) {
        List<Calendar> days = List.of(
                new Calendar(LocalDate.of(2025,1,10), true,true,true,3),
                new Calendar(LocalDate.of(2025,1,11), true,true,true,2),
                new Calendar(LocalDate.of(2025,1,12), true,true,true,3),
                new Calendar(LocalDate.of(2025,1,13), true,true,true,1),
                new Calendar(LocalDate.of(2025,1,14), true,true,true,2),
                new Calendar(LocalDate.of(2025,1,15), true,true,true,3),
                new Calendar(LocalDate.of(2025,1,16), true,true,true,3),
                new Calendar(LocalDate.of(2025,1,17), true,true,true,1)


        );

        List<String> availableSlots = Slot.availableSlots(days);
        availableSlots.forEach(System.out::println);
    }
}