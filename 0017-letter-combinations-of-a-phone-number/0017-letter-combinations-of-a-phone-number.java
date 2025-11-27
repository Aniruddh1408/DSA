class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits == null || digits.isEmpty()) {
            return ans;
        }
        phNo("", digits, ans);
        return ans;
    }
    public void phNo(String p, String up, List<String> list) {
        if(up == null || up.isEmpty()) {
            list.add(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;
        if(digit > 7) {
            start += 1;
        }
        int length = 3;
        if(digit == 7 || digit == 9) {
            length += 1;
        }
        for(int i = 0; i < length; i++) {
            char ch = (char)('a' + start + i);
            phNo(p + ch, up.substring(1), list);
        }
    }
}