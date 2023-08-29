class Solution {
    public int bestClosingTime(String customers) {

        int bestTime = 0, best = 0, curr = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'Y')
                curr++;
            else
                curr--;

            if (curr > best) {
                best = curr;
                bestTime = i+1;
            }

        }

        return bestTime;
    }
}