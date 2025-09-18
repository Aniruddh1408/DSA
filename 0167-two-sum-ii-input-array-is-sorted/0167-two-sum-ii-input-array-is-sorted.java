class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start <= end) {
            int sum = numbers[start] + numbers[end];
            int mid = start + (end - start) / 2;
            if(sum == target) {
                return new int[] {start + 1, end + 1};
            } else if( sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }
}