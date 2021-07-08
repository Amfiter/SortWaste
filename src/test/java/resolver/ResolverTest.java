package resolver;

import handler.Handler;
import materials.Glass;
import materials.Material;
import materials.Metall;
import materials.Paper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ResolverTest {

   /*Handler handler = Mockito.mock(Handler.class);*/
   private List<Glass> inputObjectList = new ArrayList<>();

    @Test
    @DisplayName("shouldResolveWhatMaterialComes")
    void shouldResolveWhatMaterialBecome() {
        //when
        inputObjectList.add(new Glass(15));
        //then
        assertThat(inputObjectList.get(0)).isEqualTo(new Glass(15));
    }
   /* private static Stream<Arguments> materialCases(){
        return Stream.of(
                Arguments.arguments(new Glass(15)),
                Arguments.arguments(new Metall(65)),
                Arguments.arguments(new Paper(85))
        );
    }*/
}