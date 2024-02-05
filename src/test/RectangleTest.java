package test;

import main.Rectangle;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class RectangleTest {

    @Test
    public void should_return_area_when_passed_rectangle_edges(){
        Rectangle rectangle = new Rectangle();
        int actualArea = rectangle.area(1, 2);
        assertEquals(2, actualArea);
    }

}
