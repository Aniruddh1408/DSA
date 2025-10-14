class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ');
        String lastWord = s.substring(lastIndex + 1);
        return lastWord.length();
    }
}