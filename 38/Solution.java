import java.util.HashMap;

class Solution {

    static HashMap<Integer, String> answerMap;

    static {
        answerMap = new HashMap<Integer, String>();

        answerMap.put(1, "1");
    }
    public static String countAndSay(int n) {
        
        if(answerMap.containsKey(n)) return answerMap.get(n);

        String count = countAndSay(n -1);
        String say = "";

        while(!count.isEmpty()){
            
            char c = count.charAt(0);
            int num = 1;
            count = count.substring(1);

            while(count.isEmpty() == false && count.charAt(0) == c){
                num++;
                count = count.substring(1);
            }

            say = say + num + c;
        }

        answerMap.put(n, say);
        return say;
    }
}