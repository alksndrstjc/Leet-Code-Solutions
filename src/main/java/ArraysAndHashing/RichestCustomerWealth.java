package ArraysAndHashing;

public class RichestCustomerWealth {

    //todo You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
    // A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
    public static int maximumWealth(int[][] accounts) {
        if (accounts == null || accounts.length == 0) return 0;
        int numColumns = accounts[0].length;

        int maxWealth = 0;
        for (int i = 0; i < accounts[0].length; i++) {
            maxWealth += accounts[0][i];
        }

        for (int[] account : accounts) {
            int sum = 0;
            for (int j = 0; j < numColumns; j++) {
                sum += account[j];
            }
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
