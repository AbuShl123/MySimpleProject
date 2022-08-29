package builder;

public class InvalidNicknameException extends RuntimeException{

    public InvalidNicknameException() {}

    public InvalidNicknameException(String message) {
        super(message);
    }

}
