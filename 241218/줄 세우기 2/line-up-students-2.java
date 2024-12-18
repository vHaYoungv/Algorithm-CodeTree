import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i=0; i<n;i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            students.add(new Student(h,w,i+1));
        }
        Collections.sort(students, Comparator.comparingInt((Student a)->a.h).thenComparingInt(a->-(a.w)));
        for(int i=0;i<n;i++){
            Student s = students.get(i);
            System.out.printf("%d %d %d\n", s.h, s.w, s.i);
        }
    }
}

class Student {
    int h, w, i;
    Student(int h, int w, int i){
        this.h = h;
        this.w = w;
        this.i = i;
    }
}