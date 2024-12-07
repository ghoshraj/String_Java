package string;

public class StringQns {
    public static String encrypt(String  s , int key){
        char []keypair = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char []key1 = "QAZWSXEDCRFVTGBYHNUJMIKLOP".toCharArray();
        char arr[] = s.toCharArray();
        String res="";
        for (int i = 0; i < arr.length; i++){
            char index = arr[i];//B
            int out=0;
            for(int j=0;j<keypair.length+1;j++)
            {
                if(index==keypair[j])
                {
                    out=j;
                    break;
                }
            }
            out+=key;
            res +=key1[out % 26];
        }
        return res;

    }
    public static void main(String[] args) {
        String s = "GOOD";
        int key = 3;
        System.out.println(encrypt(s,key));
    }
}
