class Solution {
    public int reverse(int x) {

        String str = x + "";
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if(x < 0){
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, '-');
        }

        str = sb.toString();

        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            return 0;
        }
        
    }
}