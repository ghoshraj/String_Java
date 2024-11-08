package string;

import java.util.Scanner;

public class Permutation {
    public static void permutation(String s , int start , int end){
        if (start == end){
            System.out.println(s);
            return;
        }
        for (int i = start; i <= end; i++){
            String s1 = swap(s,start,i);
            permutation(s1,start + 1 , end);
        }
    }
    public static String swap(String s ,int i, int j){
        char ch[] = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        permutation(s,0,s.length() - 1);
    }
}
