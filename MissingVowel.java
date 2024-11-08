package string;

import java.util.Scanner;

public class MissingVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean [] vowel = new boolean[5];
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch (ch){
                case 'a':
                    vowel[0] = true;
                    break;
                case 'e':
                    vowel[1] = true;
                    break;
                case 'i':
                    vowel[2] = true;
                    break;
                case 'o':
                    vowel[3] = true;
                    break;
                case 'u':
                    vowel[4] = true;
                    break;
            }
        }
        if (!vowel[0])
            System.out.println("a");
        if (!vowel[1])
            System.out.println("e");
        if (!vowel[2])
            System.out.println("i");
        if (!vowel[3])
            System.out.println("o");
        if (!vowel[4])
            System.out.println("u");
    }
}
