class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums) {
            if(isEven(i)) {
                count++;
            }
        }
         return count;
    }
    
        public int countDigits(int num) {
            int count = 0;
            while(num > 0) {
            count++;
            num /= 10;
            }
            return count;
        }
        public boolean isEven(int num) {
            int noOfDigits = countDigits(num);
             return noOfDigits % 2 == 0;
        }
    
    }
