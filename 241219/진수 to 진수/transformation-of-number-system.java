import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int n = sc.nextInt();
        
        System.out.println(toN(to10(String.valueOf(n), a), b));
    }

    public static String toN(int x, int n){
        String s = "";
        while(x != 0){
            s += String.valueOf(x%n);
            x = x/n;
        }
        s = new StringBuilder(s).reverse().toString();
        return s;
    }

    public static int to10(String s, int n){
        int sum = 0;
        char[] cArr = s.toCharArray();
        int k = s.length()-1;
        for (int i=0;i<s.length();i++){
            int x = Integer.parseInt(String.valueOf(cArr[i]));
            sum += x*(Math.pow(n, k-i)); 
        }
        return sum;
    }
}