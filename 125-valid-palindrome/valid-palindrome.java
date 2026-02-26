class Solution{
    public static boolean isPalindrome(String s){
        s=s.toLowerCase();
        String emp= "";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                emp+=ch;
            }
        }
        int left=0;
        int right=emp.length()-1;
        while (left<right) {
            if (emp.charAt(left)!=emp.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string:");
        String s=sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}