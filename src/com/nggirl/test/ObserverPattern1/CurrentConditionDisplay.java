package com.nggirl.test.ObserverPattern1;

import com.nggirl.test.ObserverPattern.DisplayElement;
import com.nggirl.test.ObserverPattern.subImpl.*;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  18:44
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    Observable observable;

    private float temp;
    private float humi;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp:" + temp +"\n"+ "humi:" + humi);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Observable){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTempratrue();
            this.humi = weatherData.getHumidity();
            display();
        }
    }
}
