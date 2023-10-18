package StudentManagement.controller;

import StudentManagement.Repository.StudentRepository;

public class StudentController {
    StudentRepository studentRepository = new StudentRepository();
    public void display(){
        studentRepository.display();
    }
}
