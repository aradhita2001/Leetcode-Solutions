class Solution {
    public String addBinary(String a, String b) {

        int max = (a.length() > b.length()) ? a.length() : b.length();

        byte[] a1 = new byte[max];
        byte[] b1 = new byte[max];

        for (int i = 1; i <= max; i++) {
            if (i <= a.length())
                a1[max - i] = Byte.parseByte(a.charAt(a.length() - i) + "");
            else
                a1[max - i] = 0;
        }

        for (int i = 1; i <= max; i++) {
            if (i <= b.length())
                b1[max - i] = Byte.parseByte(b.charAt(b.length() - i) + "");
            else
                b1[max - i] = 0;
        }

        byte carry = 0;
        byte[] ans = new byte[max + 1];

        for (int i = max - 1; i >= 0; i--) {
            ans[i + 1] = (byte) (a1[i] ^ b1[i] ^ carry);
            carry = (byte) ((a1[i] & b1[i]) | (b1[i] & carry) | (carry & a1[i]));

        }

        ans[0] = carry;

        String str = "";

        for (int i = 0; i <= max; i++) {

            if (i == 0 && ans[i] == 0)
                continue;
            str = str + ans[i];
        }

        return str;
    }
}