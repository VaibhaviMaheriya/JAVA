package Task;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Slot {

    public static List<String> availableSlots(List<Calendar> days) {

        List<Calendar> sorted = days.stream()
                .sorted(Comparator.comparing(Calendar::getDate))
                .collect(Collectors.toList());

        List<String> allSlots = new ArrayList<>();
        List<String> availableSlots = new ArrayList<>();

        for (int i = 0; i < sorted.size(); i++) {

            LocalDate start = sorted.get(i).getDate();
            int minNight = sorted.get(i).getMinNight();

            for (int j = i + 1; j < sorted.size(); j++) {

                LocalDate end = sorted.get(j).getDate();
                long stayNights = ChronoUnit.DAYS.between(start, end);

                if (stayNights < minNight) continue;

                allSlots.add(start + " → " + end);
            }
        }

        for (String slot : allSlots) {

            String[] parts = slot.split(" → ");
            LocalDate start = LocalDate.parse(parts[0]);
            LocalDate end = LocalDate.parse(parts[1]);

            List<Calendar> period = sorted.stream()
                    .filter(c -> !c.getDate().isBefore(start) && !c.getDate().isAfter(end))
                    .toList();

            boolean allAvailable = period.stream()
                    .allMatch(Calendar::getAvailable);

            if (allAvailable) {
                availableSlots.add(slot);
            }
        }

        return availableSlots;
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