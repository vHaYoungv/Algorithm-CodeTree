import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(reValue(a,b));
    }

    public static String reValue(int a, int b){
        if(a<b) {
            a = a+10;
            b = b*2;
        } else {
            a = a*2;
            b = b+10;
        }
        return String.format("%d %d", a, b);
    }
}
