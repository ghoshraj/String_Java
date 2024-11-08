package string;

import java.util.Scanner;

public class All_Palindrome {
    public static boolean isPalindrome(String s , int start , int end){
        s = s.toLowerCase();
        int i = start;
        int j = end;
        boolean flag = true;
        while (i < j){
            if (s.charAt(i) != s.charAt(j)) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length() - 1; i++){
            for (int j = i + 1; j < s.length(); j++){
                if (isPalindrome(s,i ,j))
                    System.out.println(s.substring(i ,j + 1));
            }
        }
    }
}
