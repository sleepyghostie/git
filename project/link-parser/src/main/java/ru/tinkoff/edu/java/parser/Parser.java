package project.src.main.java.ru.tinkoff.edu.java.linkParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.tinkoff.edu.java.parser.links.GitHubLinkParse;
import ru.tinkoff.edu.java.parser.links.LinkParse;
import ru.tinkoff.edu.java.parser.links.StackOverflowLinkParse;
import ru.tinkoff.edu.java.parser.result.GitHubResultRecord;
import ru.tinkoff.edu.java.parser.result.StackOverflowResultRecord;

import static org.junit.jupiter.api.Assertions.*;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import ru.tinkoff.edu.java.parser.links.LinkParse;
import ru.tinkoff.edu.java.parser.result.ParseResult;

public class Parser {
    private LinkParse linkParse;

    public void setLinks(LinkParse linkParse) {
        this.linkParse = linkParse;
    }

    public ParseResult checkLink(String link) {
        if (!isValidUrl(link)) {
            return null;
        }
        return linkParse.check(link);
    }

    private boolean isValidUrl(String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (MalformedURLException | URISyntaxException e) {
            return false;
        }
    }
}