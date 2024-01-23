package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanPlaceFlowersTest {

    @Test
    public void testCanPlaceFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCannotPlaceFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCanPlaceFlowersInEmptyBed() {
        int[] flowerbed = {0, 0, 0, 0, 0};
        int n = 3;
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCannotPlaceFlowersInAdjacentPlots() {
        int[] flowerbed = {1, 0, 0, 1, 0, 0, 1};
        int n = 2;
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCanPlaceFlowersExactlyInEmptyBed() {
        int[] flowerbed = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int n = 5;
        assertTrue(CanPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

    @Test
    public void testCannotPlaceFlowersWhenNotEnoughSpace() {
        int[] flowerbed = {1, 0, 0, 1};
        int n = 2;
        assertFalse(CanPlaceFlowers.canPlaceFlowers(flowerbed, n));
    }

}