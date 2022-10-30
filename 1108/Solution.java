class Solution {
    public String defangIPaddr(String address) {
        
        int index = address.indexOf(".");
        while(index != -1){
            address = address.substring(0, index) + "[.]" + address.substring(index + 1);
            index = address.indexOf(".", index + 2);
        }

        return address;
    }
}