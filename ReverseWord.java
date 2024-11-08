package string;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String s3 = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--){
            s3 = s3 + " " +arr[i];
        }
        System.out.println(s3);
    }
}
