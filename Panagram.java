package string;

import java.util.Scanner;

public class Panagram {
    public static boolean ispanagram(String s){
        s = s.toLowerCase();
        if (s.length() < 26)
            return false;
        for (char ch = 'a'; ch <= 'z'; ch++){
            if (s.indexOf(ch) == -1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        System.out.println(ispanagram(s));
    }
}
