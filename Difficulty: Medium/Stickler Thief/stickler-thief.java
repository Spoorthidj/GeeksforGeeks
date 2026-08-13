class Solution {
    public int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return robbery(n-1, arr, dp);
    }
    static int robbery(int index, int[] arr, int[] dp) {
        if(index == 0)
            return arr[0];
        if(index == 1)
            return Math.max(arr[0], arr[1]);
        if(dp[index] != -1)
            return dp[index];
        return dp[index] = Math.max(arr[index] + robbery(index-2, arr, dp),
            robbery(index-1, arr, dp));
    }
}