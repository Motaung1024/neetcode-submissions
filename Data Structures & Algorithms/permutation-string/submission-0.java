class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++)   {
            chars.add(s1.charAt(i));
        }

        for (int i = 0; i < s2.length(); i++)   {
            if (chars.contains(s2.charAt(i)))    {
                ArrayList<Character> copy = new ArrayList<>(chars);

                for (int j = i; j < s2.length(); j++)   {
                    if (copy.contains(s2.charAt(j)))    {
                        copy.remove(Character.valueOf(s2.charAt(j)));
                    }

                    else
                        break;
                }

                if (copy.isEmpty()) {
                    return true;
                }
            }
        }

        return false;
    }
}
