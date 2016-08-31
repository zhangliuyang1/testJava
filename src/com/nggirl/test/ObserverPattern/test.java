package com.nggirl.test.ObserverPattern;

import com.nggirl.test.ObserverPattern.obserImpl.CurrentConditionDisplay;
import com.nggirl.test.ObserverPattern.subImpl.WeatherData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  18:12
 */
public class test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80,65,20);
//        List<Object> objects = Collections.synchronizedList(new ArrayList<>());
    }
}
