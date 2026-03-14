public class HouseRobber {
     public static int robber(int[]money,int i){
        if(i==0)
            return money[0];
        int include=money[i]+robber(money,i-2);
        int exclude=robber(money,i-1);
       return Math.max(include,exclude);


     }
}
