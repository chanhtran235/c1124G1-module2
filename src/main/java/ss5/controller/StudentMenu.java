package ss5.controller;

import ss5.model.Student;
import ss5.service.impl.StudentService;
import ss5.view.StudentView;

import java.util.Scanner;

public class StudentMenu {
    private Scanner scanner = new Scanner(System.in);
    private StudentService studentService = new StudentService();

    public void display() {
        boolean flag = true;
        while (flag) {
            System.out.println("---Chức năng" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    // hiển thị danh sách
                    Student[] students = studentService.getAll();
                    StudentView.display(students);
                    break;
                case 2:

                    Student student =  StudentView.inputDataForStudent();
                    studentService.add(student);
                    break;
                case 3:
                    // xoá
                    break;
                default:
                    System.exit(0);
            }
        }


    }
}
