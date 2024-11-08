package string;

import java.util.Scanner;

public class ArrangeCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String small = "";
        String big = "";
        String num = "";
        String special = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                small = small + ch +"";
            }
            else if (ch >= 'A' && ch <= 'Z') {
                big = big + ch +"";
            }
            else if (ch >= '1' && ch <= '9') {
                num = num + ch +"";
            }
            else {
                special = special + ch+"";
            }
        }
        String s1 = special + num + big + small;
        System.out.println(s1);
    }
}
