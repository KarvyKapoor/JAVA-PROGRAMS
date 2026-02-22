// Creating Student class for their details
public class Student {

    // Declaring variables
    private final int id;
    private String name;
    private int age;
    private String course;

    // Storing Input info of student
    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // get the stored element
    public int getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getCourse(){return course;}

    // set information
    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}
    public void setCourse(String course){this.course=course;}

    @Override
    public String toString(){
        // returning student info
        return "ID: "+id+", Name: "+name+", Age: "+age+", Course: "+course;
    }
}
