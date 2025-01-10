package ss5;

import java.util.Scanner;

public class StudentMenu {
    private Scanner scanner = new Scanner(System.in);
    private StudentManager studentManager = new StudentManager();
    public void display(){
        boolean flag = true;
        while (flag){
            System.out.println("---Chức năng" +
                    "\n 1. Hiển thị" +
                    "\n 2. Thêm mới" +
                    "\n 3. Xoá" +
                    "\n 4. Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // hiển thị danh sách
                   Student[] students = studentManager.getAll();
                    for (Student student: students) {
                        if (student!=null){
                            System.out.println(student);
                        }

                    }
                    break;
                case 2:
                    // them mơi
                    System.out.println("nhập id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập tên");
                    String name = scanner.nextLine();
                    Student student = new Student(id,name);
                    studentManager.add(student);
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
