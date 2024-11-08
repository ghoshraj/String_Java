package string;

import java.util.Scanner;

public class ReverseWordWithoutSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String s1 = "";
        char arr[] = s.toCharArray();
        int i = s.length() - 1;
        int j = s.length() - 1;
        while (i > 0){
         while (j > 0 && arr[j] != ' ')
             j--;
         s1 += s.substring(j,i+1) + " ";
         j--;
         i = j;
        }
        System.out.println(s1.trim());
    }
}
