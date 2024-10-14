package task;

import java.util.ArrayList;

public class Class {
    private String name;
    private ArrayList<Group> groups;
    private ArrayList<Student> students;

    public Class(String name){
        this.name=name;
        this.groups=new ArrayList<>();
        this.students=new ArrayList<>();
    }

    //添加小组到班级
    public void addGroup(Group group){
        groups.add(group);
    }

    //添加学生到班级
    public void addStudent(Student student){
        students.add(student);
    }

    //获取班级中的所有小组
    public ArrayList<Group> getGroups(){
        return groups;
    }

    //获取班级中的所有学生
    public ArrayList<Student> getStudents(){
        return students;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Class{name='" + name + "',groups=" + groups +",students=" + students + "}";
    }
}
