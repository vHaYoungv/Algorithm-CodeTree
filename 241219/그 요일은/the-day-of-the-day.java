import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        String A = sc.next();
        
        int day1 = getDays(m1, d1);
        int day2 = getDays(m2, d2);
        int days = day2-day1;
        int startDay = yoil.get(A);

        int cnt = 0;
        if (days-startDay>=0){
            cnt = (days-startDay)/7 + 1;
        }
        System.out.println(cnt);
    }

    private static int getDays(int m, int d){
        int days = 0;
        int[] lastDay = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i=0; i<m; i++){
            days += lastDay[i];
        }
        return days + d;
    }

    private static Map<String, Integer> yoil = new HashMap<String, Integer>(){{
            put("Mon", 0);
            put("Tue", 1);
            put("Wed", 2);
            put("Thu", 3);
            put("Fri", 4);
            put("Sat", 5);
            put("Sun", 6);
        }};
}