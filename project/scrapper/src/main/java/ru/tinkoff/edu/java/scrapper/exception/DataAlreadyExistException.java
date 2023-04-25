package project.scrapper.src.main.java.ru.tinkoff.edu.java.scrapper.exception;

public class DataAlreadyExistException extends RuntimeException{
    public DataAlreadyExistException(String message) {
        super(message);
    }
}