class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length()) return false;

        int[] ransomCount = new int[26];
        int[] magazineCount = new int[26];

        for(int i = 0; i < ransomNote.length(); i++){
            ransomCount[ransomNote.charAt(i) - 'a']++;
        }

        for(int i = 0; i < magazine.length(); i++){
            magazineCount[magazine.charAt(i) - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(ransomCount[i] > magazineCount[i]) return false;
        }

        return true;
    }
}