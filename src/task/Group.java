package task;

import java.util.ArrayList;

public class Group {
    private String name;
    private ArrayList<Student> students;

    public Group(String name){
        this.name=name;
        this.students=new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Group{name='" + name + "',students=" + students + "}";
    }
}
