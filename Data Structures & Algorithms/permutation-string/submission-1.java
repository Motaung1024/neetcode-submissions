class Solution {
    public boolean checkInclusion(String s1, String s2) {

        Map<Character, Integer> target = new HashMap<>();

        for (char c : s1.toCharArray()) {
            target.put(c, target.getOrDefault(c, 0) + 1);
        }

        int len = s1.length();

        for (int i = 0; i <= s2.length() - len; i++) {

            Map<Character, Integer> copy = new HashMap<>(target);

            boolean valid = true;

            for (int j = i; j < i + len; j++) {
                char c = s2.charAt(j);

                if (!copy.containsKey(c)) {
                    valid = false;
                    break;
                }

                copy.put(c, copy.get(c) - 1);

                if (copy.get(c) == 0) {
                    copy.remove(c);
                }
            }

            if (valid && copy.isEmpty()) {
                return true;
            }
        }

        return false;
    }
}