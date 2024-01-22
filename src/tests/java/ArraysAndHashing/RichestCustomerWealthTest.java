package ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    @Test
    public void testMaximumWealthWithSingleCustomer() {
        int[][] accounts = {{5, 8, 2}};
        int expectedWealth = 15;  // Sum of elements in the single row
        assertEquals(expectedWealth, RichestCustomerWealth.maximumWealth(accounts));
    }

    @Test
    public void testMaximumWealthWithMultipleCustomers() {
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expectedWealth = 24;  // Sum of elements in the third row
        assertEquals(expectedWealth, RichestCustomerWealth.maximumWealth(accounts));
    }

    @Test
    public void testMaximumWealthWithEmptyAccounts() {
        int[][] accounts = {};
        int expectedWealth = 0;  // No customers, so wealth is zero
        assertEquals(expectedWealth, RichestCustomerWealth.maximumWealth(accounts));
    }

    @Test
    public void testMaximumWealthWithEmptyBanks() {
        int[][] accounts = {
                {},
                {},
                {}
        };
        int expectedWealth = 0;  // No money in any bank, so wealth is zero
        assertEquals(expectedWealth, RichestCustomerWealth.maximumWealth(accounts));
    }

    @Test
    public void testMaximumWealthWithNegativeNumbers() {
        int[][] accounts = {
                {-1, -2, -3},
                {-4, -5, -6},
                {-7, -8, -9}
        };
        int expectedWealth = -6;  // Sum of elements in the second row
        assertEquals(expectedWealth, RichestCustomerWealth.maximumWealth(accounts));
    }

}