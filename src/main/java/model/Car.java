package model;

import interfaces.Vehicle;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Car implements Vehicle {


    public enum carBrand{
        MERCEDES, AUDI, BMW;
    }

    public enum carColor{
        NIEBIESKI, CZARNY, ZIELONY;
    }

    public boolean isEfficient() {
        return false;
    }

    public boolean ismoving() {
        return true;
    }

    public String currentTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
}
