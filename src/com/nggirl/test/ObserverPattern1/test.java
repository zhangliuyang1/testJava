package com.nggirl.test.ObserverPattern1;

import com.nggirl.test.ObserverPattern.obserImpl.*;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  18:49
 */
public class test {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(20,30,40);
    }
}
