import java.util.Arrays;
public class MemoFrogJump {
    public static int MemoFrogJump(int[] height, int index, int[] dp) {
        if (index == 0)
            return 0;
        if (dp[index] != -1) {
            return dp[index];
        }
        int jumpOne = MemoFrogJump(height, index - 1, dp) + Math.abs(height[index] - height[index - 1]);
        int jumpTwo = Integer.MAX_VALUE;
        if (index > 1) {
            jumpTwo = MemoFrogJump(height, index - 2, dp) + Math.abs(height[index] - height[index - 2]);
        }
        dp[index] = Math.min(jumpOne, jumpTwo);
        return dp[index];
    }
    public static void main(String args[]) {
        int[] height = {10, 20, 10, 40};
        int n = height.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int result = MemoFrogJump(height, n - 1, dp);
        System.out.println(result);
    }
}