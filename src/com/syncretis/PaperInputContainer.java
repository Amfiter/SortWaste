package com.syncretis;

public class PaperInputContainer extends RecyclableMaterialContainer{
    double weight;

    public PaperInputContainer(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double getWeight(double weight) {
        return weight;
    }
}
