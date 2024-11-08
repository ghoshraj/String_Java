package string;

import java.util.Scanner;

public class ConvertFirstAndLastChar_IN_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String s2 ;
        for (int i = 0; i < arr.length; i++){
            String a = arr[i];
            char b = Character.toUpperCase(arr[i].charAt(0));
            char c = Character.toUpperCase(arr[i].charAt(a.length() - 1));
            s2 = b + a.substring(1,a.length()-1)+c;
            System.out.println(s2);
        }
    }
}
