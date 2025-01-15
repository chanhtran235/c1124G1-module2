package ss5.service;

import ss5.model.Student;

public interface IStudentService {

    Student[] getAll();

    void add(Student student);

}
