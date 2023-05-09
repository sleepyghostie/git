package project.bot.src.main.java.ru.tinkoff.edu.java.bot.service;

import ru.tinkoff.edu.java.bot.model.request.LinkUpdateRequest;

public interface UpdateService {
    void receiver(LinkUpdateRequest update);
}