package TestDrivenDevelopment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesTest {
    Shapes shape = new Shapes();

    @Test
    public void SquareTest(){
     double actual = shape.ComputeAreaOfSquare(4);
     assertEquals(16,actual);

    }


    @Test
    public void CircleTest(){
        double actual = shape.ComputeAreaOfSquare(5);
        assertEquals(25.0,actual);
    }


}
