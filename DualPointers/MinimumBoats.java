/* 
 * Utilize two-pointer greedy algorithm to calculate min number of boats
 * Maxmium of two passengers, every boat has same weight limit.
 */
class MinimumBoats {
    public int numRescueBoats(int[] people, int limit) {
        int temp = limit;
        int numBoats = 0;

        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        for (int k = 0; k < people.length; k++) {
            if (people[i] + people[j] <= limit) {
                numBoats++;
                i++;
                j--;
            } else {
                numBoats++;
                j--;
            }

            if (j < i) {
                break;
            }
        }


        return numBoats;
    }
}
