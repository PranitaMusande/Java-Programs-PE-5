//6. Write a program to implement set interface which sorts the given randomly ordered names in
//
//        ascending order. Convert the sorted set in to an array list
//        Input : Harry Olive Alice Bluto Eugene
//        Output :
//        Sorted Set : Alice Bluto Eugene Harry Olive
//        Array list from Set : Alice Bluto Eugene Harry Olive

package com.stackroute.PE5;

import java.util.*;

public class SortArrayList
{
    public void sortArrayListUsingSortedSet()
    {
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Pranita");
        treeSet.add("Abhi");
        treeSet.add("Zeba");
        treeSet.add("Abhi");
        treeSet.add("Kiran");
        treeSet.add("Rutu");


       List<String> list=new ArrayList<>(treeSet);
       System.out.println(treeSet);

    }

    public static void main(String[] args)
    {
        SortArrayList sortArrayList=new SortArrayList();
        sortArrayList.sortArrayListUsingSortedSet();
    }
}
