package string;

import java.util.Scanner;

public class PalindromeCheck {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
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
        System.out.println(isPalindrome(s));
    }
}
