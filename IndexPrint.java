package string;

import java.util.Scanner;

public class IndexPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i)+"=" + i);
            for (int j = i + 1; j < s.length(); j++){
                if (s.charAt(i) == s.charAt(j))
                    System.out.print("," + j);
            }
            System.out.println();
        }
    }
}
