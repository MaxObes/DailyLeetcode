class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        int max = -199999;
        for (int x : candies) {
            if (x > max) {
                max = x;
            }
        }

        for (int i = 0; i < candies.length; i++) {
                arr.add((candies[i] + extraCandies) >= max);
        }

        return arr;
    }
}
