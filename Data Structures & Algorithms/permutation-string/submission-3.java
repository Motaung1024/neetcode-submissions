class Solution {
    public boolean checkInclusion(String s1, String s2) {

        // Map<Character, Integer> target = new HashMap<>();

        // for (char c : s1.toCharArray()) {
        //     target.put(c, target.getOrDefault(c, 0) + 1);
        // }

        // int len = s1.length();

        // for (int i = 0; i <= s2.length() - len; i++) {

        //     Map<Character, Integer> copy = new HashMap<>(target);

        //     boolean valid = true;

        //     for (int j = i; j < i + len; j++) {
        //         char c = s2.charAt(j);

        //         if (!copy.containsKey(c)) {
        //             valid = false;
        //             break;
        //         }

        //         copy.put(c, copy.get(c) - 1);

        //         if (copy.get(c) == 0) {
        //             copy.remove(c);
        //         }
        //     }

        //     if (valid && copy.isEmpty()) {
        //         return true;
        //     }
        // }

        // return false;

        /*      MORE OPTIMISED APPROACH     */

        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> copy = new HashMap<>();

        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s2.charAt(i);
            copy.put(c, copy.getOrDefault(c, 0) + 1);
        }

        if (copy.equals(map))   {
            return true;
        }

        int l = 0, r = s1.length();

        while (r < s2.length()) {
            char left = s2.charAt(l);

            copy.put(left, copy.get(left) - 1);

            if (copy.get(left) == 0) {
                copy.remove(left);
            }

            copy.put(s2.charAt(r), copy.getOrDefault(s2.charAt(r), 0) + 1);
            r++;
            l++;

            if (copy.equals(map))   {
                return true;
            }
        }

        return false;
    }
}