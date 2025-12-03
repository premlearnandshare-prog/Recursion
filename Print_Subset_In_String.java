package Recursion;

public class Print_Subset_In_String {
    public static void main(String[] args){
         String s = "abc";
         int n = s.length();
         String ans = " ";
         subset(0,s,n,ans);
    }
    public static void subset(int i, String s, int n, String ans){
         if (i == n) {
             System.out.println(ans);
             return;
         }
         char ch = s.charAt(i);
         subset(i+1,s,n,ans + ch);
         subset(i+1,s,n,ans);
    }
}
