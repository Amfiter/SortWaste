package com.syncretis;

import java.util.List;
import java.util.StringJoiner;

public class Garbage {
    private double weight;
    private KindsOfGarbage name;
    public Garbage(KindsOfGarbage name, double weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Garbage.class.getSimpleName() + "[", "]")
                .add("weight=" + weight)
                .add("name='" + name + "'")
                .toString();
    }
}
