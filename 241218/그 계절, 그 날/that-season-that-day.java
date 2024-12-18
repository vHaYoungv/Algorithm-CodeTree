import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y=sc.nextInt(), m=sc.nextInt(), d=sc.nextInt();
        System.out.println(getAnswer(y,m,d));
    }

    public static String getAnswer(int y, int m, int d) {
        int[] lastDay = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0){
            lastDay[1] = 29;
        }
        if(d<=lastDay[m-1]){
            return getSeason(m);
        } else {
            return "-1";
        }
    }

    public static String getSeason(int m){
        if(3<=m && m<=5){
            return "Spring";
        }
        else if(6<=m && m<=8){
            return "Summer";
        }
        else if(9<=m && m<=11){
            return "Fall";
        }
        else {
            return "Winter";
        }
    }
}