class Solution {
    public boolean hasDuplicate(int[] nums) {
        int numslength = nums.length;
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < numslength; i++){
            if (!seen.contains(nums[i])){
                seen.add(nums[i]);
            }
            else
                return true;
        }
        return false;
    }
}