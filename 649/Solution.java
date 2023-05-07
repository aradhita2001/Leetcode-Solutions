class Solution {
    public String predictPartyVictory(String senate) {

        int liveD = 0, liveR = 0;
        int cancelD = 0, cancelR = 0;

        do{
            liveD = 0;
            liveR = 0;
            
            for(int i = 0; i < senate.length(); i++){

                if(senate.charAt(i) == 'R'){
                    if(cancelR == 0){
                        cancelD++;
                        liveR++;
                    }
                    else{
                        cancelR--;
                        senate = senate.substring(0, i) + senate.substring(i).replaceFirst("[R]", "0");
                    }
                }
                else if(senate.charAt(i) == 'D'){
                    if(cancelD == 0){
                        cancelR++;
                        liveD++;
                    }
                    else{
                        cancelD--;
                        senate = senate.substring(0, i) + senate.substring(i).replaceFirst("[D]", "0");
                    }
                }
            }
        }while(liveD != 0 && liveR != 0);
        
        if(liveD != 0) return "Dire";
        return "Radiant";
    }
}