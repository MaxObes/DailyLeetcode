// Given a string s, find minimum number of substrings where each substring
// only contains one instance of any letter in the alphabet
// String s = "SSS", returns 3 -> "S" "S" "S"

// Utilize Hashmap to check if character has been found in our substring in O(1)
// If so, add partition (count++) and clear the hashmap for next substring.

class MinimumPartitions {
    public int partitionString(String s) {
        
        int count = 1;
        int index = 0;

        HashMap<Character, Boolean> hmp = new HashMap<Character, Boolean>();

        while (index < s.length()) {
            if (hmp.containsKey(s.charAt(index))) {
                count++;
                hmp.clear();
            }
            hmp.put(s.charAt(index), true);
            index++;
        }

        

        return count;
    }
}
