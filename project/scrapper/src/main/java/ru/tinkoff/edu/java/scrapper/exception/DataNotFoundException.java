package scrapper.src.main.java.ru.tinkoff.edu.java.scrapper.exception;

public class DataNotFoundException extends RuntimeException{
    public DataNotFoundException(String message) {
        super(message);
    }
}