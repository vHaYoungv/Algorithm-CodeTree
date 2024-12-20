// L흰 R검 
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = 0;
        int w = 0;

        // 양 끝 구하기
        Point lPoint = new Point(0, 'G');
        Point rPoint = new Point(0, 'G');
        int now = 0;
        int move = 0;
        char dir = '\0';
        for(int i=0;i<n;i++){
            move = sc.nextInt();
            dir = sc.next().charAt(0);
            
            if(dir=='R'){
                if(now == lPoint.pos){
                    lPoint.color='B';
                }
                now += move;
                if (now>=rPoint.pos){
                    rPoint.color = 'B';
                    rPoint.pos = now;
                }
            }
            if(dir=='L'){
                if(now == rPoint.pos){
                    rPoint.color='W';
                }
                now -= move;
                if (now<=lPoint.pos){
                    lPoint.color = 'W';
                    lPoint.pos = now;
                }
            }
        }

        // 마지막 방향 기준으로 WB/BW 계산
        if(rPoint.color=='B'){
            b += rPoint.pos - now;
        }
        if(rPoint.color=='W'){
            w += rPoint.pos - now;
        }
        if(lPoint.color=='B'){
            b += now - lPoint.pos;
        }
         if(lPoint.color=='W'){
            w += now - lPoint.pos;
        }

        System.out.printf("%d %d", w, b);
    }

    public static class Point{
        int pos;
        char color;
        Point(int pos, char color){
            this.pos = pos;
            this.color = color;
        }
    }

    
}