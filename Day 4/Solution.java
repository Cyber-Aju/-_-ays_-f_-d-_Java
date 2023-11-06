import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store the elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement is already in the map, return its index and the current index
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise, put the current element and its index into the map
            map.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[0];
    }
}

