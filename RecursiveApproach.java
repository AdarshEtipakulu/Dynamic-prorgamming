public class RecursiveApproach {
    public static int knapsack(int index, int capacity, int[] weight, int[] value) {
        if (index == 0) {
            if (weight[0] <= capacity)
                return value[0];
            return 0;
        }

        int notTake = knapsack(index - 1, capacity, weight, value);
        
        int take = Integer.MIN_VALUE;
        if (weight[index] <= capacity) {
            take = value[index] + knapsack(index - 1, capacity - weight[index], weight, value);
        }

        return Math.max(take, notTake);
    }

    public static void main(String args[]) {
        int[] weight = {1, 2, 4, 5};
        int[] value = {5, 4, 8, 6};
        int capacity = 5;
        int n = weight.length;
        System.out.println(knapsack(n - 1, capacity, weight, value));
    }
}