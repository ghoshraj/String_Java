package string;

import java.util.HashSet;
import java.util.Set;

public class FindSubStringOfAString {
    public static String substring(String s){
        int i = 0 , j = 0 , max = 0;
        String longestsubstring = "";
        Set<Character>characters = new HashSet<>();
        while (i < s.length()){
            if (!characters.contains(s.charAt(i))){
                characters.add(s.charAt(i));
                if (characters.size() > max){
                    max = characters.size();
                    longestsubstring = s.substring(j , i + 1);
                }
                i++;
            }
            else {
                characters.remove(s.charAt(j));
                j++;
            }
        }
        return longestsubstring;
    }
    public static void main(String[] args) {
        String s = "abcbc";
        System.out.println(substring(s));
    }
}
