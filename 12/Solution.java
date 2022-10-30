class Solution {
    public String intToRoman(int num) {

        String roman = "";

        int thousand = num / 1000;
        int hundred = (num % 1000) / 100;
        int ten = (num % 100) / 10;
        int digit = num % 10;

        for(int i = 0; i < thousand; i++){
            roman = roman + "M";
        }

        if(hundred == 9) {
            roman = roman + "CM";
            hundred = 0;
        }

        if(hundred > 4) {
            roman = roman + "D";
            hundred -= 5;
        }

        if(hundred == 4){
            roman = roman + "CD";
            hundred = 0;
        }

        for(int i = 0; i < hundred; i++){
            roman = roman + "C";
        }

        if(ten == 9){
            roman = roman + "XC";
            ten = 0;
        }

        if(ten > 4){
            roman = roman + "L";
            ten -= 5;
        }

        if(ten == 4) {
            roman = roman + "XL";
            ten = 0;
        }

        for(int i = 0; i < ten; ten--){
            roman = roman + "X";
        }

        if(digit == 9){
            roman = roman + "IX";
            digit = 0;
        }

        if(digit > 4){
            roman = roman + "V";
            digit -= 5;
        }

        if(digit == 4){
            roman = roman + "IV";
            digit = 0;
        }

        for(int i = 0; i < digit; digit--){
            roman = roman + "I";
        }

        return roman;        
    }
}