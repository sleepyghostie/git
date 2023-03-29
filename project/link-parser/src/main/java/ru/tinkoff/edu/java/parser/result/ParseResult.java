package src.main.java.ru.tinkoff.edu.java.parser.result;


public sealed interface ParseResult permits GitHubResultRecord, StackOverflowResultRecord {
    String getResult();
}