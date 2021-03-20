package com.company;

public abstract class Processor {
    private double frequency;
    private double cache;
    private byte bitCapacity;
    public String getDetails (){
        return("frequency" + frequency + "cache" + cache + "bitCapacity" + bitCapacity);
    }
    abstract String dataProcess(String data);
    abstract String dataProcess(long data);
}
