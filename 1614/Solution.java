class Solution {
    public int maxDepth(String s) {

        int max = 0, count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                max = count > max ? count : max;
            }

            if (c == ')')
                count--;

        }

        return max;
    }
}