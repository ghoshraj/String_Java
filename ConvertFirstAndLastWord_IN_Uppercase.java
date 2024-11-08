package string;

import java.util.Scanner;

public class ConvertFirstAndLastWord_IN_Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        String s2 = "";
        for (int i = 0; i < arr.length; i++){
            if (i == 0 || i == arr.length - 1){
                s2+=arr[i].toUpperCase()+" ";
            }
            else {
                s2+=arr[i]+" ";
            }
        }
        System.out.println(s2);
    }
}
