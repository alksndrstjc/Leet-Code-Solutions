package ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //TODO: Given an integer n, return a string array answer (1-indexed) where:
    // answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    // answer[i] == "Fizz" if i is divisible by 3.
    // answer[i] == "Buzz" if i is divisible by 5.
    // answer[i] == i (as a string) if none of the above conditions are true.
    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) result.add("FizzBuzz");
            if (i % 3 == 0 && i % 5 != 0) result.add("Fizz");
            if (i % 5 == 0 && i % 3 != 0) result.add("Buzz");
            if (!(i % 3 == 0 || i % 5 == 0)) result.add(String.valueOf(i));
        }

        return result;
    }
}
