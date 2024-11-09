package string;

public class DirectionString {
    public static void main(String[] args) {
        String s = "WNEENESENNN";
        int x = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            switch (a){
                case 'W':
                    x--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        int ans = (int) Math.sqrt(x2 + y2);
        System.out.println(ans);
    }
}
