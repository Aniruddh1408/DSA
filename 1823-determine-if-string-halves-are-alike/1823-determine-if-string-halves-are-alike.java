class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2);

        int countVowels1 = countVowels(s1);
        int countVowels2 = countVowels(s2);

        return countVowels1 == countVowels2;
    }
        public int countVowels(String s) {
            int count = 0;
            for(char ch : s.toCharArray()) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
            return count;
        }
}