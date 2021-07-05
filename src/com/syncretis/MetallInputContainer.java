package com.syncretis;

public class MetallInputContainer extends RecyclableMaterialContainer{
    double weight;

    public MetallInputContainer(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight(double weight) {
        return weight;
    }
}
