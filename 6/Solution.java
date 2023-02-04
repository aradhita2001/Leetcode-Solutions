import java.util.HashMap;

class Solution {
    public String convert(String s, int numRows) {
        if(numRows >= s.length() || numRows == 1) return s;

        HashMap<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();

        for(int i = 0; i < numRows; i++){
            //System.out.println("hi");
            map.put(i, new StringBuilder());
        }

        int j = 0, change = 1;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            map.get(j).append(c);

            if(j == 0) change = 1;
            if(j >= numRows - 1) change = -1;

            j = j + change;
        }

        String ans = "";

        for(int i = 0; i < numRows; i++){

            //System.out.println(i + "  " + map.get(i).toString());
            ans += map.get(i).toString();
        }
        return ans;
    }
    /* 
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        String s = solution.convert("PAYPALISHIRING", 3);
        System.out.println(s);
    }
    */
}