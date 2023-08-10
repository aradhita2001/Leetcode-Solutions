class Solution {
    public int[] decode(int[] encoded, int first) {

        int n = encoded.length;
        int[] decoded = new int[n + 1];

        for (int i = 0; i < n; i++) {
            decoded[i] = first;
            first = encoded[i] ^ decoded[i];
        }

        decoded[n] = first;

        return decoded;
    }
}