// Decrease nums[i] by 1 and increase nums[i - 1] by 1
// Therefore left-most element can never be reduced

// Using a "fill the water basin" mentality, we slowly expand our window
// over the array. 

// EX: [3, 7, 1, 6]
// [5,5,2,5].
// The maximum integer of nums is 5. It can be shown that the maximum number cannot be less than 5.
// Therefore, we return 5.

// First iteration, sum = 3
//                  result = max(0, Ceil(3/1)) // 3
// Second, sum = 10
//         result = max(3, Ceil(10/2)) // 5
// Third, sum = 11
//        result = max(5, Ceil(11/3) // 4) // 5

class MinimizeMaximum {
    public int minimizeArrayValue(int[] nums) {
        double sum = 0;
        double result = 0;
        
        for (int i = 0; i < nums.length; i++) {
          sum += nums[i];
          result = Math.max(result, Math.ceil(sum / (i + 1)));
        }
        
        return (int) result;
    }
}
