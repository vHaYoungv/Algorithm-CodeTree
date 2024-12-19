import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt(), d1 = sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
        String A = sc.next();
        
        int day1 = getDays(m1, d1);
        int day2 = getDays(m2, d2);
        int ifMon = A.equals("Mon")? 1:0;

        System.out.println((day2-day1)/7 + ifMon);
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
            put("Mon", 1);
            put("Tue", 2);
            put("Wed", 3);
            put("Thu", 4);
            put("Fri", 5);
            put("Sat", 6);
            put("Sun", 7);
        }};
}