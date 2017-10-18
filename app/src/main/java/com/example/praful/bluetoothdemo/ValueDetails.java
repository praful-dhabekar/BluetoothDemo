package com.example.praful.bluetoothdemo;

/**
 * Created by praful on 10/17/2017.
 */

public class ValueDetails {

    String temp,ldr,gas,dateTime;

    public ValueDetails(String temp, String ldr, String gas, String dateTime) {
        this.temp = temp;
        this.ldr = ldr;
        this.gas = gas;
        this.dateTime = dateTime;
    }
    public ValueDetails() {
        this.temp = null;
        this.ldr = null;
        this.gas = null;
        this.dateTime = null;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getLdr() {
        return ldr;
    }

    public void setLdr(String ldr) {
        this.ldr = ldr;
    }

    public String getGas() {
        return gas;
    }

    public void setGas(String gas) {
        this.gas = gas;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
