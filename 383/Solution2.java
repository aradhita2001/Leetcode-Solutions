class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()) return false;

        for(int i = 0; i < ransomNote.length(); i++){
            
            int index = magazine.indexOf(ransomNote.charAt(i));

            if(index == -1) return false;
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }


        return true;
    }
}