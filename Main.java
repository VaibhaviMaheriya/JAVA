package EnumExamples;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println(Operations.Add.apply(a,b));
        System.out.println(Operations.Sub.apply(a,b));
        System.out.println(Operations.Mul.apply(a,b));
    }
}
