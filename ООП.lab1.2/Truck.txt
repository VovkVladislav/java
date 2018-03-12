package com.company;

public class Truck {

//_________________________________________________ FIELDS
    private int vol = 100;
    private int weight = 20;

    static int CountVol = 100;
    static int CountWeight = 20;

    private int vLoad = 0;
    private int wLoad = 0;
    public String res;
//_________________________________________________ CONSTRUCTOR
    public Truck(int v, int w){
    vLoad += v;
    wLoad += w;}
//_________________________________________________ METHODS
    public void Load() {
        CountVol = vol - vLoad;
        CountWeight = weight - wLoad;
        res = "You can load: " + CountVol + " of volume, and " + CountWeight + " of weight";
        }
//_________________________________________________
}