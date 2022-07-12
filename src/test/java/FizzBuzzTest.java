import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void startsWithF() {
        String test = "funk";
        String result = fizzBuzz.fizzBuzzString(test);
        assertEquals("Fizz", result);
    }

    @Test
    void endsWithB() {
        String test = "pub";
        String result = fizzBuzz.fizzBuzzString(test);
        assertEquals("Buzz", result);
    }

    @Test
    void startsWithFAndEndsWithB() {
        String test = "fab";
        String result = fizzBuzz.fizzBuzzString(test);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void nullString() {
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzBuzzString(null));
    }

    @Test
    void arrayFizzBuzzTest() {
        String[] testArray = {"funk", "pub", "fab"};
        assertArrayEquals(new String[]{"Fizz", "Buzz", "FizzBuzz"}, fizzBuzz.fizzBuzzArray(testArray));

        String[] testNullValueArray = {"funk", "pub", "fab", null, "wow"};
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzBuzzArray(testNullValueArray));

        String[] testNullArray = null;
        assertThrows(IllegalArgumentException.class, () -> fizzBuzz.fizzBuzzArray(testNullArray));
    }

}
