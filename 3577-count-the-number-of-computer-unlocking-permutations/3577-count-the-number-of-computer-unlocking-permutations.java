class Solution {
    public int countPermutations(int[] complexity) {
        int mod = 1_000_000_007;
        int n = complexity.length;
        int first = complexity[0];

        for(int i = 1; i < n; i++) {
            if(complexity[i] <= first) {
                return 0;
            }
        }
        long fact = 1;
        for(int i = 2; i < n; i++) {
            fact = (fact * i) % mod;
        }
        return (int) fact;
    }
}