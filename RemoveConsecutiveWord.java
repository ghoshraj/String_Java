package string;

import java.util.Scanner;

public class RemoveConsecutiveWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();
        String s2[] = s.split(" ");
        for (int i = 0; i < s2.length; i++){
            if (s2[i].equals("\u0000"))
                continue;
            for (int j = i + 1; j < s2.length; j++){
                if (s2[i].equals(s2[j]))
                    s2[j] = "\u0000";
            }
            System.out.println(s2[i]);
        }
    }
}
