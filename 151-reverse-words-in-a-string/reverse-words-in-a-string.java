class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String arr[]=s.split("\\s+");
        String x=new String();
        for(int i=arr.length-1;i>=0;i--)

        {
            x+=arr[i];
            if(!(i==0))
            x+=" ";

        }
        return x;
    }
}