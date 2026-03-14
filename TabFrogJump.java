public class TabFrogJump {
    public static int FrogJump(int[],height){
        for( int i=1;i<n;i++){|
            int jumpOne=dp[i-1]+Math.abs(height[i],height[i-1]);
            int jumpTwo=Integer.MAX_VALUE;
            if(i>1){
                jumpTwo=dp[i-2]+Math.abs(height[i],height[i-2]);
            }
            dp[i]=Math.min(jumpOne,jumpTwo);
        }
        return dp[n-1];
    }
}
