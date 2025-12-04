package GenericClassAndMethods;

public class Util {
    public static <T> void printArray(T[] arr){
        for(T item : arr){
            System.out.println(item);
        }
    }
}
