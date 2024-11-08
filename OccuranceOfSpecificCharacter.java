package string;

import java.util.Scanner;

public class OccuranceOfSpecificCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        char arr[] = s.toCharArray();
        char a = 'a';
        int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (a == arr[j])
                    count++;
            }
        System.out.println(a +" " +  count);
    }
}
