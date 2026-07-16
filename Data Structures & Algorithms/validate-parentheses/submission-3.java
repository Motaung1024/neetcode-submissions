class Solution {
    public boolean isValid(String s) {
        
        // If there is an odd number of parentheses on the string, immediately return false;
        if (s.length() % 2 != 0)    {
            return false;
        }

        // Initialize a stack
        Stack<Character> stack = new Stack<>();

        // Create a Hashmap that stores all opening - closing parentheses pairs
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')','(');
        pairs.put('}','{');
        pairs.put(']','[');

        // Now make a single pass through the string...
        for (int i = 0; i < s.length(); i++)    {

            // Shortcut mechanism here..
            if (stack.isEmpty() && !pairs.containsValue(s.charAt(i)))
                return false;

            // Main logic
            if (stack.isEmpty() || stack.peek() != pairs.get(s.charAt(i)))    {

                if (pairs.containsKey(s.charAt(i))) {
                    return false;
                }
                
                stack.push(s.charAt(i));
            }

            else   {
                stack.pop();
            }   
        }

        if (stack.isEmpty())    {
            return true;
        }

        return false;
    }
}
