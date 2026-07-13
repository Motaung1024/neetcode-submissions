class Solution {
    public boolean isAnagram(String s, String t) {

        // Special case handing, always true
        if (s.length() != t.length()) {
            return false;
        }

        // Convert the first string into an ArrayList
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++)    {
            list.add(Character.valueOf(s.charAt(i)));
        }

        for (int i = 0; i < t.length(); i++)    {
            list.remove(Character.valueOf(t.charAt(i)));
        }

        if (list.isEmpty()) {
            return true;
        }
        else    {
            return false;
        }
    }
}
