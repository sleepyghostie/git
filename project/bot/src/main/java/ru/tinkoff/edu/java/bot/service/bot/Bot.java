package project.bot.src.main.java.ru.tinkoff.edu.java.bot.service.bot;

import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.response.BaseResponse;
import java.util.List;

public interface Bot extends AutoCloseable, UpdatesListener {

    @Override
    int process(List<Update> updates);

    void start();

    @Override
    void close();
}