package materials;

import java.util.Objects;
import java.util.StringJoiner;

public abstract class Material {
    private double weight;

    public Material(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Material.class.getSimpleName() + "[", "]")
                .add("weight=" + weight)
                .toString();
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Material)) return false;
        Material material = (Material) o;
        return Double.compare(material.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }
}
