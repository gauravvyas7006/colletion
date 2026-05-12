import java.util.ArrayList;
import java.util.List;
public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> student = new ArrayList();
        student.add(1);
        student.add(2);
        student.add(3);
        
        student.add(1, 50);
        System.out.println(student);
        System.out.println(student.get(1));
        System.out.println(student.remove(1));
        System.out.println(student);
        student.set(1, 1000);
        System.out.println(student);
    }
}