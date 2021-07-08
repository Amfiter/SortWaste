package containers;

import materials.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public abstract class Container<MATERIAL extends Material>  {
    private Class<MATERIAL> type;
    private List<MATERIAL> materials = new ArrayList<>();
    private double weight;

    public List<MATERIAL> getMaterials() {
        return materials;
    }
    public void setMaterials(List<MATERIAL> materials) {
        this.materials = materials;
    }

    public void addElement(MATERIAL type){
        materials.add(type);
    }

    public Class<MATERIAL> getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Container.class.getSimpleName() + "[", "]")
                .add("materials=" + materials)
                .add("weight=" + weight)
                .toString();
    }
}
