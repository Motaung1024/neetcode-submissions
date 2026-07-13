class Solution {
    public boolean isPalindrome(String s) {
        
        // pre-process the string

        String refined = "";

        for (int i = 0; i < s.length(); i++)    {

            if (Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))    {
                refined = refined + s.charAt(i);
            }
        }

        refined = refined.toLowerCase();


        System.out.println(refined);

        int l = 0;
        int r = refined.length() - 1;

        while (l <= r)  {

            if (refined.charAt(l) != refined.charAt(r)) {
                return false;
            }

            l++;
            r--;
        }

        return true;

    }
}
