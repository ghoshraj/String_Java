package string;

import java.util.Scanner;

public class NameToDotName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String fans = "";
        for (int i = 0; i < arr.length - 1; i++){
            fans+=arr[i].charAt(0)+".";
        }
        fans += arr[arr.length-1];
        System.out.println(fans);
    }
}
