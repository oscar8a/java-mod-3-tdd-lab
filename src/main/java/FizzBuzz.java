public class FizzBuzz {

    public String fizzBuzzString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Function does not take null values in order to FizzBuzz");
        }
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        if (str.startsWith("f"))  return "Fizz";
        if (str.endsWith("b")) return "Buzz";

        return str;
    }

    public String[] fizzBuzzArray(String[] inputArray) {
        if (inputArray == null) {
            throw new IllegalArgumentException("Can't FizzBuzz with a null Array, provide Array with String items");
        }
        String[] result = new String[inputArray.length];

        for (int i=0; i < inputArray.length; i++) {
            result[i] = fizzBuzzString(inputArray[i]);
        }

        return result;
    }
}
