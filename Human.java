package gretaTumberg;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Human {
    private int id;
    private String name;
    private int waterCount;
    private int gasCountDay;
    private int gasCountNight;
    private int electroCountDay;
    private int electroCountNight;

    public Human() {

    }

    public Human(String[] info) {
        id = Integer.parseInt(info[0]);
        name = info[1];
        waterCount = Integer.parseInt(info[2]);
        gasCountDay = Integer.parseInt(info[3]);
        gasCountNight = Integer.parseInt(info[4]);
        electroCountDay = Integer.parseInt(info[5]);
        electroCountNight = Integer.parseInt(info[6]);
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWaterCount() {
        return waterCount;
    }

    public int getGasCountDay() {
        return gasCountDay;
    }

    public int getGasCountNight() {
        return gasCountNight;
    }

    public int getElectroCountDay() {
        return electroCountDay;
    }

    public int getElectroCountNight() {
        return electroCountNight;
    }


}
