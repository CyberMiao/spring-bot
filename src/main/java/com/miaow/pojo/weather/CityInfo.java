/**
  * Copyright 2024 json.cn 
  */
package com.miaow.pojo.weather;

/**
 * 城市信息
 *
 * @author TenStreets
 * @version 1.0.0
 */
public class CityInfo {

    /**
     * 城市
     */
    private String city;
    /**
     * 城市key
     */
    private String citykey;
    /**
     * 父城市（省份）
     */
    private String parent;
    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 设置城市
     *
     * @param city 城市
     */
    public void setCity(String city) {
         this.city = city;
     }

    /**
     * 获取城市
     *
     * @return 城市名称
     */
    public String getCity() {
         return city;
     }

    /**
     * 设置 citykey
     *
     * @param citykey 城市key
     */
    public void setCitykey(String citykey) {
         this.citykey = citykey;
     }

    /**
     * 获取 CityKey
     *
     * @return citykey
     */
    public String getCitykey() {
         return citykey;
     }

    /**
     * 设置父级
     *
     * @param parent 父城市（省份）
     */
    public void setParent(String parent) {
         this.parent = parent;
     }

    /**
     * 获取父级
     *
     * @return 父城市（省份）
     */
    public String getParent() {
         return parent;
     }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
         this.updateTime = updateTime;
     }

    /**
     * 获取更新时间
     *
     * @return 更新实践
     */
    public String getUpdateTime() {
         return updateTime;
     }

}