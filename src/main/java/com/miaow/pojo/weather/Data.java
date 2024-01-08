/**
  * Copyright 2024 json.cn 
  */
package com.miaow.pojo.weather;

import java.util.List;

/**
 * 天气数据
 *
 * @author TenStreets
 * @version 1.0
 */
public class Data {

    private String shidu;
    private int pm25;
    private int pm10;
    private String quality;
    private String wendu;
    private String ganmao;
    private List<Forecast> forecast;
    private Yesterday yesterday;
    public void setShidu(String shidu) {
         this.shidu = shidu;
     }
     public String getShidu() {
         return shidu;
     }

    public void setPm25(int pm25) {
         this.pm25 = pm25;
     }
     public int getPm25() {
         return pm25;
     }

    public void setPm10(int pm10) {
         this.pm10 = pm10;
     }
     public int getPm10() {
         return pm10;
     }

    public void setQuality(String quality) {
         this.quality = quality;
     }
     public String getQuality() {
         return quality;
     }

    public void setWendu(String wendu) {
         this.wendu = wendu;
     }
     public String getWendu() {
         return wendu;
     }

    public void setGanmao(String ganmao) {
         this.ganmao = ganmao;
     }
     public String getGanmao() {
         return ganmao;
     }

    public void setForecast(List<Forecast> forecast) {
         this.forecast = forecast;
     }
     public List<Forecast> getForecast() {
         return forecast;
     }

    public void setYesterday(Yesterday yesterday) {
         this.yesterday = yesterday;
     }
     public Yesterday getYesterday() {
         return yesterday;
     }

}