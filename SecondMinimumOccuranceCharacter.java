package string;

import java.util.Scanner;

public class SecondMinimumOccuranceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        char minchar = ' ';
        char secondminchar = ' ';
        int mincount = 1;
        int secondmincount = 1;
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            if (arr[i] == '\u0000')
                continue;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    arr[j] = '\u0000';
                }
            }
            if (count <= mincount){
                secondmincount = mincount;
                mincount = count;
                secondminchar = minchar;
                minchar = arr[i];
            }
            else if (count <= secondmincount || mincount == secondmincount){
                secondmincount = count;
                secondminchar = arr[i];
            }
        }
        System.out.println(secondminchar + " : " + secondmincount);
    }
}
