package project.bot.src.main.java.ru.tinkoff.edu.java.bot.model.response;

import lombok.*;

import java.net.URI;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LinkResponse {
    private Long id;
    private URI url;
}