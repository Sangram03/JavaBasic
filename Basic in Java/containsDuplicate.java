public class containsDuplicate {
    
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        final int n = nums.length;
        int[] ans = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        // Calculate prefix products
        prefix[0] = 1;
        for (int i = 1; i < n; ++i) 
            prefix[i] = prefix[i - 1] * nums[i - 1];

        // Calculate suffix products
        suffix[n - 1] = 1;
        for (int i = n - 2; i >= 0; --i) 
            suffix[i] = suffix[i + 1] * nums[i + 1];

        // Calculate product except self
        for (int i = 0; i < n; ++i) 
            ans[i] = prefix[i] * suffix[i];

        return ans;
    }
}


