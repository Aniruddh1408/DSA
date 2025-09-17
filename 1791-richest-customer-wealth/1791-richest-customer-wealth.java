class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = Integer.MIN_VALUE;
        for(int[] person : accounts) {
            int sum = 0;
            for(int account : person) {
                sum += account;
            }
            if(sum > result) {
                result = sum;
            }
        }
        return result;
    }
}