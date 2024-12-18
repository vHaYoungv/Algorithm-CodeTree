import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        
        int sum=0, a1=0, a2=0;
        for (int i=0; i<m; i++){
            sum = 0;
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            for(int j=a1-1; j<a2; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}

