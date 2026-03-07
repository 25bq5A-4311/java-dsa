class Solution {
    public void moveZeroes(int[] arr) {
        int k=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k++]=arr[i];
                
        }

        }
        while(k<n){
            arr[k]=0;
            k++;
        }

    }
}