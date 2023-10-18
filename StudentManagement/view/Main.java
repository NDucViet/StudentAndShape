package StudentManagement.view;

import StudentManagement.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.display();
    }
}
