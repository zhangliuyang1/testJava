package com.nggirl.test.thinkinjva.testmainmethod;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/30  17:31
 */
public class Reservation {
    private int id;
    private int userId;
    private String address;
    private Date date;
    private double price;
    private float time;
    private BigDecimal cost;

    @Override
    public boolean equals(Object o){
        if (this == o) return true;

        if (o == null || this.getClass() != o.getClass()) return false;

        Reservation reservation = (Reservation)o;

        if (id != reservation.id) return false;
        if (userId != reservation.userId) return false;
        if(Double.compare(reservation.price,price) != 0)return false;
        if(Float.compare(reservation.time,time)!=0) return false;
        if (address != null ? !address.equals(reservation.address) : reservation.address != null)return false;
        if (cost != null ? !cost.equals(reservation.cost) : reservation.address != null) return false;
        return !(date != null ? !date.equals(reservation.date) : reservation.date != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31*result + userId;
        result = 31*result + (address != null ? address.hashCode() : 0);
        result = 31*result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31*result + (int)(temp ^ (temp >>> 32));
        result = 31*result + (time != +0.0f ? Float.floatToIntBits(time) : 0);
        result = 31*result + (cost != null ? cost.hashCode() : 0);
        return result;
    }
    /*  @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + userId;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (time != +0.0f ? Float.floatToIntBits(time) : 0);
        return result;
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (Double.compare(that.price, price) != 0) return false;
        if (Float.compare(that.time, time) != 0) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        return !(date != null ? !date.equals(that.date) : that.date != null);

    }*/
}
