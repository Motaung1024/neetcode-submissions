class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        else if (s.equals(t))   
            return t;
        
        
        HashMap<Character, Integer> tmap = new HashMap<>();

        for (int i = 0; i < t.length(); i++)    {
            char c = Character.valueOf(t.charAt(i));
            tmap.put(c, tmap.getOrDefault(c, 0) + 1);
        }
        // System.out.println(t);
        // System.out.println(tmap);

        String finale = "";

        for (int i = 0; i < s.length(); i++)    {
            char start = Character.valueOf(s.charAt(i));

            if (tmap.containsKey(start))    {
                HashMap<Character, Integer> copy = new HashMap<>(tmap);
                String result = "";

                for (int j = i; j < s.length(); j++)    {
                    String temp = Character.valueOf(s.charAt(j)) + "";
                    result = result.concat(temp);
                    
                    if (copy.containsKey(Character.valueOf(s.charAt(j))))   {
                        int curr = copy.get(Character.valueOf(s.charAt(j)));
                        copy.replace(Character.valueOf(s.charAt(j)),curr - 1);

                        if (copy.get(Character.valueOf(s.charAt(j))) == 0)  {
                            copy.remove(Character.valueOf(s.charAt(j)));
                        }

                    }
                    System.out.println(copy);
                    System.out.println("Result is: " + result);
                    if (copy.isEmpty()) {
                            break;
                        }
                }

                if (copy.isEmpty() && (finale.isEmpty() || result.length() < finale.length())) {
                    finale = result;
                }
            }
        }
        return finale;
    }
}
