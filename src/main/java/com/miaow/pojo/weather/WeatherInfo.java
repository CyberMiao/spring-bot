package com.miaow.pojo.weather;
import com.alibaba.fastjson2.annotation.JSONField;

import java.util.Date;

/**
 * 天气信息
 *
 * @author TenStreets
 * @version 1.0
 */
public class WeatherInfo {

    /**
     * 消息
     */
    private String message;
    /**
     * 状态码
     */
    private int status;
    /**
     * 日期
     */
    private String date;
    /**
     * 时间
     */
    private Date time;
    /**
     * 城市信息
     */
    private CityInfo cityInfo;
    /**
     * 数据
     */
    private Data data;

    /**
     * 设置消息
     *
     * @param message 消息
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 获取消息
     *
     * @return 消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置状态码
     *
     * @param status 状态码
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 获取状态码
     *
     * @return 状态码
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设定日期
     *
     * @param date 日期
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 获取日期
     *
     * @return 字符串
     */
    public String getDate() {
        return date;
    }

    /**
     * 设定时间
     *
     * @param time 时间
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * 获取时间
     *
     * @return 日期
     */
    public Date getTime() {
        return time;
    }

    /**
     * 设置城市信息
     *
     * @param cityInfo 城市信息
     */
    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    /**
     * 获取城市信息
     *
     * @return 城市信息
     */
    public CityInfo getCityInfo() {
        return cityInfo;
    }

    /**
     * 设置数据
     *
     * @param data 数据
     */
    public void setData(Data data) {
        this.data = data;
    }

    /**
     * 获取数据
     *
     * @return 天气数据
     */
    public Data getData() {
        return data;
    }

}