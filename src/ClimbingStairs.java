public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n){
        int[] memo = new int[n + 1];
        return dfs(n, memo);
    }
    public static int dfs(int i , int[] memo){
        if(i <= 1)
            return 1;

        if (memo[i] != 0){
            return memo[i];
        }
        return memo[i] = dfs(i - 1, memo) + dfs(i - 2, memo);
    }
}
