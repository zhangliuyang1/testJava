package com.nggirl.test.ObserverPattern.obserImpl;

import com.nggirl.test.ObserverPattern.DisplayElement;
import com.nggirl.test.ObserverPattern.Observer;
import com.nggirl.test.ObserverPattern.Subject;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  18:07
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temprature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("tempture:" + temprature + "\n" + "humidity:" + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temprature =temp;
        this.humidity = humidity;
        display();
    }
}
