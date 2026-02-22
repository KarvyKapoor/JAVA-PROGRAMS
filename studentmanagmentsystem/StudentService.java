// 
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private final List<Student> students=new ArrayList<>();
    public void addStudent(Student s){
        students.add(s);
        System.out.println("Student added Succesfully");
    }

    public void viewAll(){
        if(students.isEmpty()){
            System.out.println("No students found");
            return;
        }
        for(Student s: students){
            System.out.println(s);
        }
    }

    public Student searchById(int id){
        for (Student s: students){
            if(s.getId()==id)
                return s;
        }
        return null;
    }

    public void deleteStudent(int id){
        Student s = searchById(id);
        if(s!=null){
            students.remove(s);
            System.out.println("Student deleted");
        }
        else{
            System.out.println("Student not found");
        }
    }
}