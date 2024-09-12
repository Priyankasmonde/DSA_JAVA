import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[] { numToIndex.get(complement), i };
            }
            numToIndex.put(nums[i], i);
        }
        return new int[] {}; // This line should never be reached if there's always exactly one solution
    }
    public static void main(String[] args) {
        int nums[] = {7, 3, 2, 4, 5};
        int result[]=twoSum(nums,9);
        System.out.println(result[0]);
        System.out.println(result[1]);
        
    }
}

