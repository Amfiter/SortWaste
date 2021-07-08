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

    public <MATERIAL extends Material> void resolve(Container<MATERIAL> container) {//нужно протестить то что метод вызыывается с разным видом материлов, без моков, 2. тест будет проверять попал ли glass  в if где glass нужно будет сделать verify мокнутого объекта
        //  что у этого мока вызовется inputObject  которому во внутрь передастся glass
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
