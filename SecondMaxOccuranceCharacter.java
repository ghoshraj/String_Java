package string;

import java.util.Scanner;

public class SecondMaxOccuranceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int maxcount = 1;
        int secondmaxcount = 1;
        char high =' ';
        char ans = ' ';
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
            if (count > maxcount){
                secondmaxcount = maxcount;
                maxcount = count;
                ans = high;
                high = arr[i];
            }
            else if (count > secondmaxcount || maxcount == secondmaxcount){
                secondmaxcount = count;
                ans = arr[i];
            }
        }
        System.out.println(ans + " : " + secondmaxcount);
    }
}
