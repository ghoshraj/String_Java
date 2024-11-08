package string;

import java.util.Scanner;

public class ReverseCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        int i = 0;
        int j = 0;
        while (i < arr.length){
            while (j < arr.length && arr[j] !=' ')
                j++;
            int start = i;
            int end = j - 1;
            while (start < end){
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            j++;
            i = j;
        }
        System.out.println(arr);
    }
}
