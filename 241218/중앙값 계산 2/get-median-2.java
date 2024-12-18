import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i<n; i+=2){
            int[] subArr = Arrays.copyOfRange(arr, 0, i+1);
            Arrays.sort(subArr);
            System.out.print(subArr[i/2] + " ");
        }
    }
}

