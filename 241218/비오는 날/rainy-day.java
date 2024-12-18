import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[][] weathers = new String[n][];
        for (int i=0;i<n;i++){
            String[] weather = sc.nextLine().split(" ");
            weathers[i] = weather;
        }
        Arrays.sort(weathers, Comparator.comparing(a->a[0]));
        for(String[] weather:weathers){
            if(weather[2].equals("Rain")){
                System.out.printf("%s %s %s", weather[0], weather[1], weather[2]);
                break;
            }
        }
    }
}

