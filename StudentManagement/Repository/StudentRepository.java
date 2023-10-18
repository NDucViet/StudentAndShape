package StudentManagement.Repository;


import StudentManagement.DataAccess.Function;


public class StudentRepository implements IStudentRepository {

    Function function = new Function();

    @Override
    public void display() {
        function.display();
    }

}
