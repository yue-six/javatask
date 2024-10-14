package task;

import java.util.ArrayList;
import java.util.Random;

public class ClassManagement {
    public static Random random = new Random();

    //创建班级
    public static void main(String[] args){
        Class class1 = new Class("Class 7");
        Class class2 = new Class("Class 8");

        //创建小组
        Group group1 = new Group("Group 1");
        Group group2 = new Group("Group 2");
        Group group3 = new Group("Group 3");
        Group group4 = new Group("Group 4");
        Group group5 = new Group("Group 5");
        Group group6 = new Group("Group 6");
        Group group7 = new Group("Group 7");
        Group group8 = new Group("Group 8");
        Group group9 = new Group("Group 9");
        Group group10 = new Group("Group 10");

        //创建学生
        Student student1 = new Student("徐佳浩",1);
        Student student2 = new Student("张博恺",2);
        Student student3 = new Student("姜博文",3);
        Student student4 = new Student("张天润",4);
        Student student5 = new Student("李哲",5);
        Student student6 = new Student("程昱硕",6);
        Student student7 = new Student("孔佳辉",7);
        Student student8 = new Student("闫亚磊",8);
        Student student9 = new Student("卢怡杉",9);
        Student student10 = new Student("杨悦",10);
        Student student11 = new Student("王佳乐",11);
        Student student12 = new Student("赵青灵",12);
        Student student13 = new Student("王荣",13);
        Student student14 = new Student("王晨悦",14);
        Student student15 = new Student("刘金淇",15);
        Student student16 = new Student("吴倩",16);
        Student student17 = new Student("吴玮",17);
        Student student18 = new Student("宿高祥",18);
        Student student19 = new Student("朱涵萌",19);
        Student student20 = new Student("刘佳铭",20);

        //把学生放在小组中
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group3.addStudent(student5);
        group3.addStudent(student6);
        group4.addStudent(student7);
        group4.addStudent(student8);
        group5.addStudent(student9);
        group5.addStudent(student10);
        group6.addStudent(student11);
        group6.addStudent(student12);
        group7.addStudent(student13);
        group7.addStudent(student14);
        group8.addStudent(student15);
        group8.addStudent(student16);
        group9.addStudent(student17);
        group9.addStudent(student18);
        group10.addStudent(student19);
        group10.addStudent(student20);

        //把小组放在班级中
        class1.addGroup(group1);
        class1.addGroup(group2);
        class1.addGroup(group3);
        class1.addGroup(group4);
        class1.addGroup(group5);
        class2.addGroup(group6);
        class2.addGroup(group7);
        class2.addGroup(group8);
        class2.addGroup(group9);
        class2.addGroup(group10);
        //把学生放在班级中
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.addStudent(student4);
        class1.addStudent(student5);
        class1.addStudent(student6);
        class1.addStudent(student7);
        class1.addStudent(student8);
        class1.addStudent(student9);
        class1.addStudent(student10);
        class2.addStudent(student11);
        class2.addStudent(student12);
        class2.addStudent(student13);
        class2.addStudent(student14);
        class2.addStudent(student15);
        class2.addStudent(student16);
        class2.addStudent(student17);
        class2.addStudent(student18);
        class2.addStudent(student19);
        class2.addStudent(student20);

        //创建班级列表
        ArrayList<Class> classes = new ArrayList<>();
        classes.add(class1);
        classes.add(class2);

        System.out.println("随机抽取班级：");
        Class randomClass = getRandomClass(classes);
        System.out.println(randomClass.getName());

        System.out.println("随机抽取小组：");
        Group randomGroupFromClass = getRandomGroup(randomClass);
        System.out.println(randomGroupFromClass);

        System.out.println("随机抽取小组中学生：");
        Student randomStudentFromGroup = getRandomStudentFromGroup(randomGroupFromClass);
        System.out.println(randomStudentFromGroup);

        System.out.println("随机从全班抽取学生：");
        Student randomStudentFromClass = getRandomStudentFromClass(randomClass);
        System.out.println(randomStudentFromClass);
    }

    public static Class getRandomClass(ArrayList<Class> classes){
        Random random = new Random();
        return classes.get(random.nextInt(classes.size()));
    }
    public static Group getRandomGroup(Class clazz) {
        ArrayList<Group> groups = clazz.getGroups();
        return groups.get(random.nextInt(groups.size()));
    }

    public static Student getRandomStudentFromGroup(Group group) {
        ArrayList<Student> students = group.getStudents();
        return students.get(random.nextInt(students.size()));
    }

    public static Student getRandomStudentFromClass(Class clazz) {
        ArrayList<Student> students = clazz.getStudents();
        return students.get(random.nextInt(students.size()));
    }
}
