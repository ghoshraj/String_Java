package string;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        int length = 0;
        String s2 = "";
        for (int i = 0; i < arr.length; i++){
            String a = arr[i];
            if (a.length() > length)
                s2 = arr[i];
        }
        System.out.println(s2);
    }
}
