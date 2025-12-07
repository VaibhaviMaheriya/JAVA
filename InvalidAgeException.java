package CustomException;

public class InvalidAgeException extends RuntimeException{

    @Override
    public String getMessage(){
        return "Invalid Age";
    }

}
