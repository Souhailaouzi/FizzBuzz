package souhail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FIZZBIZZ_TEST {
    @Test
    public void testBuzz() {
        assertEquals("1 2 Fizz 4 Buzz", FIZZBIZZ.think(5));
    }

    @Test
    public void testFizz() {
    assertEquals("1 2 Fizz", FIZZBIZZ.think(3));
}
@Test
public void testFizzBuzz() {
    assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz", FIZZBIZZ.think(15));
}

@Test
public void testNumbersAndSpace() {
    assertEquals("1 2 Fizz 4 Buzz", FIZZBIZZ.think(5));
}   
}
