package souhail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FIZZBIZZ_TEST {
    @Test
    public void testBuzz() {
        assertEquals("Buzz", FIZZBIZZ.think(5));
    }

    @Test
    public void testFizz() {
    assertEquals("Fizz", FIZZBIZZ.think(3));
}
@Test
public void testFizzBuzz() {
    assertEquals("FizzBuzz", FIZZBIZZ.think(15));
}


   
}
