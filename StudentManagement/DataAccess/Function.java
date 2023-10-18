package StudentManagement.DataAccess;

import java.util.ArrayList;
import java.util.Collections;

import StudentManagement.common.Valid;
import StudentManagement.model.Student;

public class Function {

    Valid valid = new Valid();

    public void addStudent(ArrayList<Student> lt) {
        System.out.println("Please input student information ");
        System.out.print("Name: ");
        String name = valid.checkInputString();
        System.out.print("Classes: ");
        String classes = valid.checkInputString();
        System.out.print("Mark: ");
        float mark = valid.checkInputFloat();
        lt.add(new Student(name, mark, classes));
    }

    public void print(ArrayList<Student> lt) {
        if (lt.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        Collections.sort(lt);
        for (int i = 0; i < lt.size(); i++) {
            System.out.println("--------Student " + i + 1 + "--------");
            System.out.println("Name: " + lt.get(i).getName());
            System.out.println("Classes: " + lt.get(i).getClasses());
            System.out.println("Mark: " + lt.get(i).getMark());
        }
    }

    public void display() {
        ArrayList<Student> lt = new ArrayList<>();
        addStudent(lt);
        while (true) {
            System.out.print("Do you want to enter more student information?(Y/N): ");
            if (valid.checkInputYN()) {
                addStudent(lt);
            } else {
                break;
            }
        }
        print(lt);
    }
}
