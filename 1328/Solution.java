class Solution {
    public String breakPalindrome(String palindrome) {
        
        int length = palindrome.length();

        if(length == 1) return "";
        
        int i = 0;
        for(; i < length / 2; i++){
            
            if(palindrome.charAt(i) != 'a'){ 
                palindrome = palindrome.substring(0, i) + "a" + palindrome.substring(i+1);
                return palindrome;
            }
        }

        palindrome = palindrome.substring(0, length - 1) + "b" ;
        return palindrome;
    }
}