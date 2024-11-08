package string;

public class ExchangeFirstWithLastChar {
    public static void main(String[] args) {
        String arr[] = {"java", "is", "easy"};
        for (int i = 0; i < arr.length; i++){
            String s = arr[i];
            char a = s.charAt(0);
            char b = s.charAt(s.length() - 1);
            String result = b + s.substring(1,s.length()-1)+a;
            System.out.println(result);
        }
    }
}
