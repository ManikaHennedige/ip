package duke.exception;

public class MissingEventDurationException extends Exception {
    @Override
    public String getMessage() {
        return "Hmm...have you input the duration of the event?";
    }
}