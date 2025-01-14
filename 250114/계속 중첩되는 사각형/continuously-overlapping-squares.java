import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] graph = new int[201][201];
        for (int i=0; i<n; i++){
            int offset = 100;
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            if (i%2 == 0){
                for (int k=x1; k<x2; k++){
                    for (int j=y1; j<y2; j++){
                        graph[k][j] = 1;
                    }
                }
            }
            if (i%2 == 1){
                for (int k=x1; k<x2; k++){
                    for (int j=y1; j<y2; j++){
                        graph[k][j] = 2;
                    }
                }
            }
        }
        int cnt = 0;
        for (int i=0; i<=200; i++){
            for (int j=0; j<=200; j++){
                if(graph[i][j]==2){
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}