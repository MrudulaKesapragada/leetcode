class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++){
            char t=address.charAt(i);
            if(t=='.'){
                ans=ans+"[.]";

            }
            else{
                ans=ans+t;

            }
        }
        return ans;
        
    }
}