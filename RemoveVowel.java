package string;

import java.util.Scanner;

public class RemoveVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        String s1 = " ";
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                s1+=ch;
        }
        System.out.println(s1);
    }
}
