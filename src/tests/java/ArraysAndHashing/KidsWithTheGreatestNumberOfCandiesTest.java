package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    public void testKidsWithCandies() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, result);
    }

    @Test
    public void testKidsWithCandiesEqualExtraCandies() {
        int[] candies = {4, 2, 1, 3, 5};
        int extraCandies = 5;
        List<Boolean> expected = Arrays.asList(true, true, true, true, true);
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, result);
    }

    @Test
    public void testKidsWithCandiesNoExtraCandies() {
        int[] candies = {1, 2, 3, 4, 5};
        int extraCandies = 0;
        List<Boolean> expected = Arrays.asList(false, false, false, false, true);
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, result);
    }

    @Test
    public void testKidsWithCandiesEmptyArray() {
        int[] candies = {};
        int extraCandies = 2;
        List<Boolean> expected = List.of();
        List<Boolean> result = KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        assertEquals(expected, result);
    }

}