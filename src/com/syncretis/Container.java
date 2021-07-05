package com.syncretis;

public abstract class Container {
    public String name;

    public abstract double getWeight(double weight);

    public String printName(){
        return name;
    }
}
