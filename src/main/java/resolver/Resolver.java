package resolver;

import containers.Container;
import handler.Handler;
import materials.Glass;
import materials.Material;
import materials.Metall;
import materials.Paper;

public class Resolver {
    private final Handler<Material> handler;

    public Resolver(Handler<Material> handler) {
        this.handler = handler;
    }

    public <MATERIAL extends Material> void resolve(Container<MATERIAL> container) {
        for (MATERIAL material : container.getMaterials()) {
            if (material.getClass().equals(Glass.class)) {
                handler.inputObject(material);
            } else if (material.getClass().equals(Paper.class)) {
                handler.inputObject(material);
            } else if (material.getClass().equals(Metall.class)) {
                handler.inputObject(material);
            } else {
                System.out.println("Решала не понял что за тип мусора к нему пришел");
            }
        }//@beforeEach
        //init
    }
}
