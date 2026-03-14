class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int msum=0;
        int sum=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
           msum=Math.max(msum,sum);
           sum=0;
        }
        else{
            sum+=1;
        }
       }
       msum=Math.max(msum,sum);
       return msum;
    }
}