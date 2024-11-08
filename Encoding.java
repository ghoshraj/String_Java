package string;

import java.util.Scanner;

public class Encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter the level what you want : ");
        int level = sc.nextInt();
        char[]alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char [] arr = s1.toCharArray();

        for (int i = 0; i < arr.length; i++){
            int index = arr[i]-97;
            index += level;
            arr[i] = alpha[index%26];
        }
        String s2 = new String(arr);
        System.out.println(s2);
    }
}
