package ss5;

public class StudentManager {
    private static Student[] students = new Student[100];
    static {
        students[0] = new Student(1,"chánh1");
        students[1] = new Student(2,"chánh2");
        students[2] = new Student(3,"chánh3");
    }


    // chưa các method CRUD : Create, Read, Update, Delete
    // lấy danh sách ra

    public  Student[] getAll() {
        return students;
    }
    // thêm mới
    public void add(Student student){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i]= student;
                break;
            }
        }
    }
}
