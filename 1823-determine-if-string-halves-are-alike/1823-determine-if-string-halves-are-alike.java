class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        int vowelsCount = 0;
        for(int i = 0; i < s.length() / 2; i++) {
            char A = s.charAt(i);
            char B = s.charAt(s.length() / 2 + i);
            if(vowels.contains(A)) {
                vowelsCount++;
            }
            if(vowels.contains(B)) {
                vowelsCount--;
            }
        }
        return vowelsCount == 0;
    }
}