import java.util.Arrays;

public class Memoization {
    static int knapsack(int index, int capacity, int[] weight, int[] value, int[][] dp) {
        if (index == 0) {
            if (weight[0] <= capacity)
                return value[0];
            return 0;
        }

        if (dp[index][capacity] != -1) {
            return dp[index][capacity];
        }

        int notTake = knapsack(index - 1, capacity, weight, value, dp);

        int take = Integer.MIN_VALUE;
        if (weight[index] <= capacity) {
            take = value[index] + knapsack(index - 1, capacity - weight[index], weight, value, dp);
        }

        return dp[index][capacity] = Math.max(take, notTake);
    }

    public static void main(String[] args) {
        int[] weight = {1, 2, 4, 5};
        int[] value = {5, 4, 8, 6};
        int capacity = 5;
        int n = weight.length;

        int[][] dp = new int[n][capacity + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println("Maximum Value: " + knapsack(n - 1, capacity, weight, value, dp));
    }
}