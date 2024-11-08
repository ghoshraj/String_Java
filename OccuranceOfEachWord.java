package string;

import java.util.Scanner;

public class OccuranceOfEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        for (int i = 0; i < arr.length; i++){
            int count = 1;
            if (arr[i].equals("\u0000"))
                continue;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].equals(arr[j])){
                    count++;
                    arr[j] = "\u0000";
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
