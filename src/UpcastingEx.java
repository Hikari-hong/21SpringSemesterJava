public class UpcastingEx {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("홍길동");
        p = s;

        System.out.println(p.name);
        s.grade = "A"; // 컴파일 오류
        s.dept = "Com"; // 컴파일 오류
    }
}