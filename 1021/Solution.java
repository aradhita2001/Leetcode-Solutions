class Solution {
    public String removeOuterParentheses(String s) {

        int count = 0, index = 0;
        char[] ans = new char[s.length()];

        for (char p : s.toCharArray()) {

            if (p == '(') {

                if (count++ == 0)
                    continue;
                ans[index++] = p;
            }

            else {

                if (--count == 0)
                    continue;
                ans[index++] = p;
            }

        }

        return new String(ans).substring(0, index);
    }
}