package string;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String s1 = " ";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
           if (arr[i] == '\u0000')
               continue;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[j] = '\u0000';
                }
            }
            s1 += arr[i];
        }
        System.out.println(s1);
    }
}
