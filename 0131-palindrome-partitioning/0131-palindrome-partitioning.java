class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backtrack(0, s, ans, new ArrayList<>());
        return ans;
    }

    public void backtrack(int index, String s, List<List<String>> res, List<String> cur) {
        if (index == s.length()) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int i = index; i < s.length(); i++) {
            if (palindrome(s, index, i)) {
                cur.add(s.substring(index, i + 1));
                backtrack(i + 1, s, res, cur);
                cur.remove(cur.size() - 1);
            }
        }
    }

    public boolean palindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}