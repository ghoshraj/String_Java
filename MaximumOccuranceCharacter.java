package string;

import java.util.Scanner;

public class MaximumOccuranceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        char c = ' ';
        int maxcount = 1;
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            if (arr[i] == '\u0000')
                continue;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    arr[j] = '\u0000';
                    count++;
                }
            }
            if (count > maxcount){
                maxcount = count;
                c = arr[i];
            }
        }
        System.out.println(c + " : " + maxcount);
    }
}
