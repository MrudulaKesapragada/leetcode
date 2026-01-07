class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(int i=0;i<operations.length;i++)
        {
            String t=operations[i];
            if(t.equals("X++")|| t.equals("++X")){
                ans=ans+1;
            }
            else{
                ans=ans-1;
            }

        }
        return ans;
        
    }
}