package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//todo There are n kids with candies.
// You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
// and an integer extraCandies, denoting the number of extra candies that you have.
// Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
// they will have the greatest number of candies among all the kids, or false otherwise.
public class KidsWithTheGreatestNumberOfCandies {


    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        if (candies.length == 0) return Collections.emptyList();

        int max = candies[0];
        for (int n : candies) {
            if (n > max) max = n;
        }

        List<Boolean> result = new ArrayList<>();
        for (int c : candies) {
            result.add((c + extraCandies) >= max);
        }

        return result;
    }

}
