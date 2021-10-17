package schoolapp.customexceptions;

public class UnAuthourizedException extends RuntimeException {

    public  UnAuthourizedException(String message){
        super(message);

    }
}
