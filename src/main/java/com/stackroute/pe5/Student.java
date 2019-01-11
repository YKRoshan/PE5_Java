package com.stackroute.pe5;

import java.util.*;
/*Create a Student class that represents the following information of a student: id, name, and age all
the member variables should be private .
a. Implement `getter and setter` .
b. Create a `StudentSorter` class that implements `Comparator interface` .
c. Write a class `Maintest` create Student class object(minimum 5)
d. Add these student object into a List of type Student .
e. Sort the list based on their age in decreasing order, for student having same
age, sort based on their name.
f. For students having same name and age, sort them according to their ID.*/
public class Student {
    private String id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

 class MainTest {
    public static void main(String []args) {
        List<Student> students = new ArrayList<>();
        Student ob1 = new Student();
        ob1.setId("S01");
        ob1.setName("Amrit");
        ob1.setAge(20);
        Student ob2 = new Student();
        ob2.setId("S02");
        ob2.setName("Yashawant");
        ob2.setAge(20);
        Student ob3 = new Student();
        ob3.setId("S03");
        ob3.setName("Akash");
        ob3.setAge(21);
        Student ob4 = new Student();
        ob4.setId("S04");
        ob4.setName("Raj");
        ob4.setAge(23);
        Student ob5 = new Student();
        ob5.setId("S05");
        ob5.setName("Amrit");
        ob5.setAge(22);
        students.add(ob1);
        students.add(ob2);
        students.add(ob3);
        students.add(ob4);
        students.add(ob5);
        Iterator it = students.iterator();
        while (it.hasNext()) {
            Student element = (Student) it.next();
            System.out.print(element.getId() + " " + element.getName() + " " + element.getAge()+" ");
        }
        System.out.println();
        Collections.sort(students,new StudentSorter());
        Iterator it1 = students.iterator();
        while (it1.hasNext()) {
            Student element = (Student) it1.next();
            System.out.print(element.getId() + " " + element.getName() + " " + element.getAge()+" ");
        }
    }
}


class StudentSorter implements Comparator<Student> {
public int compare(Student a, Student b)
        {
        if(a.getAge()-b.getAge()!=0){
        return b.getAge()-a.getAge();
        }else {
        return a.getName().compareTo(b.getName());
        }
        }
        }



