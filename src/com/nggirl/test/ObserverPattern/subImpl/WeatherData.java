package com.nggirl.test.ObserverPattern.subImpl;

import com.nggirl.test.ObserverPattern.Observer;
import com.nggirl.test.ObserverPattern.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  17:58
 */
public class WeatherData implements Subject {
    private List observers;
    private float temprature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer =(Observer) observers.get(i);
            observer.update(temprature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float t,float h,float p){
        this.temprature = t;
        this.humidity = h;
        this.pressure = p;
        measurementsChanged();
    }
}
