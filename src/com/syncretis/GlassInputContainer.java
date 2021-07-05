package com.syncretis;

public class GlassInputContainer extends RecyclableMaterialContainer {
    double weight;

    public GlassInputContainer(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight(double weight) {
        return weight;
    }
}
