package ss5.view;

import ss5.model.Student;

import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);

    // hiển thị danh sách
    public static void display(Student[] students){
        for (Student student: students) {
            if (student!=null){
                System.out.println(student);
            }
        }
    }
    public static Student inputDataForStudent(){
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        return student;
    }
}
