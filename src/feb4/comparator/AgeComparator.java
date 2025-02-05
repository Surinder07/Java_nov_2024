package feb4.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare( s2.getAge(), s1.getAge());
    }
}
