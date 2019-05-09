package com.stackroute.PE5;

//4. Create a Student class that represents the following information of a student: id, name, and age
//        all the member variables should be private .
//        a. Implement `getter and setter` .
//        b. Create a `StudentSorter` class that implements `Comparator interface` .
//        c. Write a class `Maintest` create Student class object(minimum 5)
//        d. Add these student object into a List of type Student .
//        e. Sort the list based on their age in decreasing order, for student having
//        same age, sort based on their name.
//        f. For students having same name and age, sort them according to their ID.

import java.util.Comparator;

public class Student
{
    private int id;
    private String name;
    private int age;

    //constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Setter and Getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
}

 class StudentSorter implements Comparator<Student>
{
    @Override
    public int compare(Student stud1, Student stud2)
    {
        // for comparison
        int nameCompare = stud1.getName().compareTo(stud2.getName());
        int ageCompare;
        int idCompare;

        if (stud1.getAge() > stud2.getAge()) {
            ageCompare = -10;
        } else if (stud1.getAge() < stud2.getAge()) {
            ageCompare = 10;
        } else {

            if (nameCompare != 0) {
                return nameCompare;
            }

            if (stud1.getId() > stud2.getId()) {
                idCompare = 10;
            } else {
                idCompare = -10;
            }
            return idCompare;
        }
        return ageCompare;
    }
}
