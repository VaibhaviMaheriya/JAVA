package GenericClassAndMethods;

public class UpperBound <T extends Number>{

    private T value;

    public UpperBound(T value){
        this.value = value;
    }

    public static void main(String[] args) {

        UpperBound<Integer> a = new UpperBound<>(54);
        UpperBound<Double> b = new UpperBound<>(21.23);

//        UpperBound<String> s = new UpperBound<>("Hello")

        System.out.println(a.value.intValue());
        System.out.println(b.value.doubleValue());

    }

}
