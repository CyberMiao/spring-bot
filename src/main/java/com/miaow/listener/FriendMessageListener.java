package com.miaow.listener;

import com.miaow.pojo.weather.CityInfo;
import com.miaow.pojo.weather.Data;
import com.miaow.pojo.weather.Forecast;
import com.miaow.pojo.weather.WeatherInfo;
import com.miaow.service.WeatherService;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simbot.event.FriendMessageEvent;
import org.springframework.stereotype.Component;

/**
 * 接收好友消息
 *
 * @author TenStreets
 * @version 1.0
 */
@Component
public class FriendMessageListener {

    private WeatherService weatherService = new WeatherService();

    @Listener
    @Filter(value = "你好.*")
    public void hello(FriendMessageEvent event) {
        event.replyAsync("你好啊！");
    }

    @Listener
    @Filter(value = "天气")
    public void weather(FriendMessageEvent event) {
        String reply = weatherService.getWeather();

        event.replyAsync(reply);
    }

}
