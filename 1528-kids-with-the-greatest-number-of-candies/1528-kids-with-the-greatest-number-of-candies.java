class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandies = 0;
        for(int c : candies) {
            if(c > maxCandies) {
                maxCandies = c;
            }
        }
        for(int c : candies) {
            if(c + extraCandies >= maxCandies) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}