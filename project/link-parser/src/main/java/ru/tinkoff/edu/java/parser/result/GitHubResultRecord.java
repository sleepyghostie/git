package src.main.java.ru.tinkoff.edu.java.parser.result;

public record GitHubResultRecord(String userName, String repository) implements ParseResult {
    @Override
    public String getResult() {
        return userName + "/" + repository;
    }
}