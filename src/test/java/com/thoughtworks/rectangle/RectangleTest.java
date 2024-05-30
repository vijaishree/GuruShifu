import org.junit.jupiter.api.Test;

public class RectangleTest{
    
    @Test
    void areaIfLengthIsFourAndBreadthIsFive(){
        Rectangle area = new Rectangle();
        assert area.computeArea(4,5) == 20 ;
    }

}
