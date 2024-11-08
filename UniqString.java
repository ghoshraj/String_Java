package string;

import java.util.Scanner;

public class UniqString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        String s1 = "";
        for (int i = 0; i < arr.length; i++){
            int count = 0;
            if (arr[i] == '\u0000')
                continue;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    arr[j] = '\u0000';
                }
            }
            if (count > 0)
                arr[i] = '\u0000';
            if (arr[i] != '\u0000')
                s1+=arr[i];
        }
        System.out.println(s1);
    }
}
