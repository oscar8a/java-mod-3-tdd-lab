import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz fizzBuzz = new FizzBuzz();

    @BeforeEach
    void setUp() {
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
        String test = null;
        String result = fizzBuzz.fizzBuzzString(test);
        assertEquals("null", result);
    }

    @Test
    void arrayFizzBuzzTest() {
        String[] testArray = {"funk", "pub", "fab", null};
        String[] result = fizzBuzz.fizzBuzzArray(testArray);
        assertArrayEquals(new String[]{"Fizz", "Buzz", "FizzBuzz", "null"}, result);
    }

}
