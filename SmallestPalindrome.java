package string;

import java.util.Scanner;

public class SmallestPalindrome {
    public static boolean isPalindrome(String s,int start , int end){
        s = s.toLowerCase();
        int i = start;
        int j = end;
        while (i < j){
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String smallpali = null;
        for (int i = 0; i < s.length() - 1; i++){
            for (int j = i + 1; j < s.length();j++){
                if (isPalindrome(s,i,j)) {
                    String currentpali = s.substring(i, j + 1);
                    if (smallpali == null || currentpali.length() < smallpali.length())
                        smallpali = currentpali;
                }
            }
        }
        System.out.println(smallpali);
    }
}
