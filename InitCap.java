package string;

import java.util.Scanner;

public class InitCap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            if (i == 0 || ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i]<= 'z')
                    ch[i] = (char) (ch[i] - 32);
            }
        }
        System.out.println(ch);
    }
}
