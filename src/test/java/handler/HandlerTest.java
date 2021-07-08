package handler;

import containers.Container;
import containers.GarbageContainer;
import materials.Glass;
import materials.Material;
import materials.Metall;
import materials.Paper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class  HandlerTest {

    private List<Glass> inputObjectList = new ArrayList<>();

    @Test
    void shouldAddMaterialGlass() {
        //when
        inputObjectList.add(new Glass(15));/
        //then
        assertThat(inputObjectList.get(0)).isEqualTo(new Glass(15));
    }
}