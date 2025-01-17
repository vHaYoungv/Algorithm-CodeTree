import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> aPosition = new ArrayList<>(Arrays.asList(0));
        List<Integer> bPosition = new ArrayList<>(Arrays.asList(0));

        for(int i=0; i<n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j=0; j<t; j++){
                aPosition.add(aPosition.get(aPosition.size()-1)+v);
            }
        }

        for(int i=0; i<m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();
            for(int j=0; j<t; j++){
                bPosition.add(bPosition.get(bPosition.size()-1)+v);
            }
        }

        String first = "AB";
        int cnt = 0;
        for(int i=0; i<aPosition.size(); i++){
            // System.out.println(Integer.toString(i)+":"+first + ":" + aPosition.get(i) + ":" + bPosition.get(i));
            if(aPosition.get(i)>bPosition.get(i)) {
                if(!first.equals("A")) {
                    cnt += 1;
                }
                first = "A";
            }
            if(aPosition.get(i)==bPosition.get(i)) {
                if(!first.equals("AB")) {
                    cnt += 1;
                }
                first = "AB";
            }
            if(bPosition.get(i)>aPosition.get(i)) {
                if(!first.equals("B")) {
                    cnt += 1;
                }
                first = "B";
            }
        }

        System.out.println(cnt);
    }
}