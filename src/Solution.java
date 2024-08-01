import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique elements
        Set<Integer> seen = new HashSet<>();

        // Iterate over each number in the array
        for (int num : nums) {
            // If the number is already in the set, we found a duplicate
            if (seen.contains(num)) {
                return true;
            }
            // Add the number to the set
            seen.add(num);
        }

        // No duplicates found
        return false;
    }
}
