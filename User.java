package GenericClassAndMethods;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class User {
    int id;
    String name;
    LocalDate dob;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public User(int id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }


    public static void main(String[] args) {

        List<User> list = new ArrayList<>();

        list.add(new User(1,"A",LocalDate.of(2001,12,23)));
        list.add(new User(2,"B",LocalDate.of(2003,1,2)));
        list.add(new User(3,"C",LocalDate.of(2003,12,12)));
        list.add(new User(4,"D",LocalDate.of(2003,2,4)));
        list.add(new User(5,"E",LocalDate.of(2003,12,26)));
        list.add(new User(6,"F",LocalDate.of(2003,1,29)));
        list.add(new User(7,"G",LocalDate.of(2003,12,5)));
        list.add(new User(8,"H",LocalDate.of(2003,12,3)));
        list.add(new User(9,"I",LocalDate.of(2003,1,15)));
        list.add(new User(10,"J",LocalDate.of(2003,2,7)));

//        Map<Integer, List<LocalDate>> dates = list.stream().map(User :: getDob)
//                .collect(Collectors.groupingBy(LocalDate ::getMonthValue));
//        System.out.println(dates);

        Map<Integer, List<User>> dates = list.stream()
                .collect(Collectors.groupingBy(user -> user.getDob().getMonthValue()));
        System.out.println(dates);



        // output: {1 = 3, 2=2, 12=5}

    }
}
