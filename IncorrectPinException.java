package CustomException;

public class IncorrectPinException extends RuntimeException{

    @Override
    public String getMessage(){
        return "Incorrect Pin";
    }
}
