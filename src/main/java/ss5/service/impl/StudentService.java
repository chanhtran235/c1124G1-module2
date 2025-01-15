package ss5.service.impl;

import ss5.model.Student;
import ss5.service.IStudentService;

public class StudentService implements IStudentService {
    private static Student[] students = new Student[100];
    static {
        students[0] = new Student(1,"chánh1");
        students[1] = new Student(2,"chánh2");
        students[2] = new Student(3,"chánh3");
    }

    @Override
    public  Student[] getAll() {
        return students;
    }
    @Override
    public void add(Student student){
        for (int i = 0; i <students.length ; i++) {
            if (students[i]==null){
                students[i]= student;
                break;
            }
        }
    }
}
