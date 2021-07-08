package handler;

import containers.output.ProductContainer;
import materials.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Handler<MATERIAL extends Material> {
    private final List<MATERIAL> inputObjectList = new ArrayList<>();

    private ProductContainer productContainer;

    public ProductContainer getGlassContainer() {
        return productContainer;
    }

    private final double compression = 1.5d;

    public void recycle() {
        recycleObject();
    }

    private void recycleObject() {
        for (Material material : inputObjectList) {
            material.setWeight(material.getWeight()/compression);
        }
        productContainer = new ProductContainer();
        productContainer.setMaterials(inputObjectList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Handler)) return false;
        Handler<?> handler = (Handler<?>) o;
        return Double.compare(handler.compression, compression) == 0 && Objects.equals(inputObjectList, handler.inputObjectList) && Objects.equals(productContainer, handler.productContainer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputObjectList, productContainer, compression);
    }

    public void inputObject(MATERIAL material) {
        inputObjectList.add(material);
    }


}
