class Solution {
    public boolean validPalindrome(String s) {
        return palindromeDelete(s, 0, s.length() - 1, false);
    }
    public boolean palindromeDelete(String s, int start, int end, boolean delete) {
        while(start < end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                if(delete) {
                    return false;
                }
                return palindromeDelete(s, start + 1, end, true) || palindromeDelete(s, start, end - 1, true);
            }
        }
        return true;
    }
}