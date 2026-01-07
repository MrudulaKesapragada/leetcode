class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int a=i;
            int b=i+1;
            char f=s.charAt(a);
            char se=s.charAt(b);
            int ascii=f;
            int bscii=se;
            int t=Math.abs(f-se);
            ans=ans+t;
            
        }
        return ans;

        
    }
}