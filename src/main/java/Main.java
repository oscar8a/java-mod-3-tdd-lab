import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FizzBuzz f = new FizzBuzz();

//        System.out.println(f.fizzBuzzString("fun")); // Fizz
//        System.out.println(f.fizzBuzzString("pub")); // Buzz
//        System.out.println(f.fizzBuzzString("fab")); // FizzBuzz
//        System.out.println(f.fizzBuzzString(null)); // Throw Exception

        System.out.println(Arrays.toString(f.fizzBuzzArray(new String[]{"Fizz", "Buzz", "FizzBuzz"}))); // ["Fizz", "Buzz", "FizzBuzz"]
        System.out.println(Arrays.toString(f.fizzBuzzArray(new String[]{"funk", "pub", "fab", null, "wow"}))); // Throw Single Item Exception
        String[] nullArray = null;
        System.out.println(Arrays.toString(f.fizzBuzzArray(nullArray))); // Throw null Array Exception
    }
}
