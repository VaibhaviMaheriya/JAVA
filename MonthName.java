package EnumExamples;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public enum MonthName {

    January,February,March,April,May,June,July,August,September,October,November,December;

    public static MonthName from(LocalDate date) {
        return values()[date.getMonthValue()-1];
    }

    public static void main(String[] args) {
        List<LocalDate> dates = List.of(
                LocalDate.of(2022,12,4),
                LocalDate.of(2023,1,30),
                LocalDate.of(2019,9,8),
                LocalDate.of(2020,10,11),
                LocalDate.of(2025,12,1)
        );

        Map<MonthName,List<LocalDate>> grouped = dates.stream()
                .collect(Collectors.groupingBy(MonthName::from));

        System.out.println(grouped);
    }
}
