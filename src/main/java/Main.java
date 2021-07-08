import containers.Container;
import containers.GarbageContainer;
import handler.Handler;
import materials.Glass;
import materials.Material;
import materials.Metall;
import materials.Paper;
import resolver.Resolver;

public class Main {


    public static void main(String[] args) {
        Container garbageContainer = new GarbageContainer();
        Handler<Material> handler = new Handler<>();
        Resolver resolver = new Resolver(handler);

        garbageContainer.addElement(new Glass(15));
        garbageContainer.addElement(new Metall(65));
        garbageContainer.addElement(new Paper(85));
        System.out.println(garbageContainer);

        resolver.resolve(garbageContainer);
        handler.recycle();

        Container product = handler.getGlassContainer();

        System.out.println(product.toString());

    }

}
