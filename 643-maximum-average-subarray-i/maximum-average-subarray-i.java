class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double msum=0;
        int i=0;
        int j=0;
        double sum=0;
        while(j<k){
            sum+=arr[j];
            j++;

        }
         msum=sum;
         while(j<arr.length){
            sum+=arr[j];
            sum-=arr[i];
             msum=Math.max(msum,sum);
             i++;
             j++;
         }
         return msum/k;
       
        

    }
}