public class FizzBuzz {

    public String fizzBuzzString(String str) {
        if (str == null) return "null";
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

        if (str.startsWith("f"))  return "Fizz";
        if (str.endsWith("b")) return "Buzz";

        return str;
    }

    public String[] fizzBuzzArray(String[] inputArray) {

        for (int i=0; i < inputArray.length; i++) {
            inputArray[i] = fizzBuzzString(inputArray[i]);
        }

        return inputArray;
    }

}
