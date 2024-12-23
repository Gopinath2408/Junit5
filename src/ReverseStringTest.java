import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class ReverseStringTest{
       ReverseString obj1 = new ReverseString();


        @Test
        public void SingleWordtest () {
            String actual = obj1.reverse("java");
            String expected = "avaj";
            assertEquals(expected, actual);
        }

        @Test
        public void MultipleWordTest(){
            String actual = obj1.reverse("java is easy");
            String expected = "ysae si avaj";
            assertEquals(expected, actual);
        }

        @Test
    public void NullPointerTest(){
            String actual = obj1.reverse("java is easy");
            String expected = "ysae si avaj";
            assertEquals(expected, actual);
        }






}

