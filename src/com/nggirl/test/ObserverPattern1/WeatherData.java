package com.nggirl.test.ObserverPattern1;

import java.util.Observable;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/2/17  18:40
 */
public class WeatherData extends Observable {
    private float tempratrue;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float t,float h,float p){
        this.tempratrue = t;
        this.humidity = h;
        this.pressure = p;
        measurementsChanged();
    }

    public float getHeight() {
        return 50;
    }
    public float getTempratrue() {
        return tempratrue;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
