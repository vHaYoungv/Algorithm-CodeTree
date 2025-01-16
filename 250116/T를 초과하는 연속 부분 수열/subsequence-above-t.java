import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int max_cnt = 0;
        int cnt = 0;
        for (int i=0; i<n; i++){
            int a = sc.nextInt();
            if (a>t) {
                cnt += 1;
                if (cnt>max_cnt) {
                    max_cnt = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        System.out.println(max_cnt);
    }
}