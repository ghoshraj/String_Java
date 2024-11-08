package string;

import java.util.Scanner;

public class OccuranceOfEachCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++){
            int count = 1;
            if (arr[i] == '\u0000')
                continue;
            for (int j = i + 1; j < s.length(); j++){
                if (arr[i] == arr[j]){
                    count++;
                    arr[j] = '\u0000';
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
