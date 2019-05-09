package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MainTest
{

        public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1,"Sara",26));

        studentList.add(new Student(2,"Riya",26));

        studentList.add(new Student(3,"Abhi",26));

        studentList.add(new Student(4,"Zeba",44));

        studentList.add(new Student(5,"Rutu",26));

        System.out.println("Overriding toString and printing the ArrayList \n");
        System.out.println(studentList.toString());

        System.out.println("Printing using Iterator");
        System.out.println("Before sorting.......");

        Iterator studIterator = studentList.iterator();

        while (studIterator.hasNext()) {
            System.out.println(studIterator.next());
        }

        Collections.sort(studentList,new StudentSorter());


        Iterator studIterator1 = studentList.iterator();


        System.out.println("\nAfter Sorting...");
        while (studIterator1.hasNext()) {
            System.out.println(studIterator1.next());
        }
    }
}
