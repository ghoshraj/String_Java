package string;

import java.util.Scanner;

public class ChangeRepeatedCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            if (arr[i] == '$')
                continue;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                    arr[j] = '$';
                }
            }
            if (count > 1){
                arr[i] = '$';
            }
        }
        System.out.println(arr);
    }
}
