package project.scrapper.src.main.java.ru.tinkoff.edu.java.scrapper.model.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class LinkUpdateRequest {
    private Long tgChat;
    private String url;
    private String description;
}