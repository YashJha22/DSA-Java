// LeetCode 1672: Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j]
// represents the amount of money the i-th customer has in the j-th bank.
// Return the wealth that the richest customer has.
//
// A customer's wealth is the total amount of money they have in all banks.

class Solution {
    public int maximumWealth(int[][] accounts) {
        int rich = 0;

        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }

            rich = Math.max(rich, temp);
        }

        return rich;
    }
}