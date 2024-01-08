package com.miaow.service;

import com.alibaba.fastjson2.JSON;
import com.miaow.pojo.weather.CityInfo;
import com.miaow.pojo.weather.Data;
import com.miaow.pojo.weather.Forecast;
import com.miaow.pojo.weather.WeatherInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;


@Service
public class WeatherService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WeatherService.class);

    public String getWeather() {
        // 获取天气内容Json形式
        String json = getResponseJson();
        WeatherInfo weatherInfo = JSON.parseObject(json, WeatherInfo.class);
        // 拼接天气信息
        CityInfo cityInfo = weatherInfo.getCityInfo();
        Data weatherData = weatherInfo.getData();
        Forecast todayForecast = weatherData.getForecast().get(0);
        StringBuilder weather = new StringBuilder();
        weather.append(weatherInfo.getTime()).append("\n")
                .append("城市: ").append(cityInfo.getParent()).append(cityInfo.getCity()).append("\n")
                .append("当前温度: ").append(weatherData.getWendu()).append("\n")
                .append("当前湿度: ").append(weatherData.getShidu()).append("\n")
                .append("pm2.5: ").append(weatherData.getPm25()).append("\n")
                .append("pm10: ").append(weatherData.getPm10()).append("\n")
                .append("空气质量: ").append(weatherData.getQuality()).append("\n").append("\n")
                .append("今日天气: ").append(todayForecast.getType()).append("\n")
                .append("温度: ").append("\n\t").append(todayForecast.getHigh()).append("\n\t").append(todayForecast.getLow()).append("\n")
                .append(todayForecast.getNotice());
        return weather.toString();
    }

    /**
     * 获取api的响应json
     *
     * @return 获取城市的天气信息
     */
    public String getResponseJson() {
        StringBuilder response = new StringBuilder();
        try {
            URL url = new URL("http://t.weather.itboy.net/api/weather/city/101110101");
            InputStreamReader isReader = new InputStreamReader(url.openStream(), StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isReader);//采用缓冲式读入
            String str = "";
            while ((str = br.readLine()) != null) {
                response.append(str);
            }
        } catch (IOException e) {
            LOGGER.error("weather服务出错，api调用错误！", e);
        }
        return response.toString();
    }

}
