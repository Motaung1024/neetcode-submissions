class Solution {
    public int lengthOfLongestSubstring(String s) {
    
        int l = 0, r = 0, max = 0;

        Set<Character> set = new HashSet<>();

        while (r < s.length())  {

            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
            }

            else    {
                set.remove(s.charAt(l));
                l++;
            }

            if (max < set.size())   {
                max = set.size();
            }
        }

        return max;

    }
}
