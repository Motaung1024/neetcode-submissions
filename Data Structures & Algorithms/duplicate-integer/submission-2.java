class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums)    {
            if (set.add(num) == false)  {
                return true;
            }
        }

        return false;
    }
}