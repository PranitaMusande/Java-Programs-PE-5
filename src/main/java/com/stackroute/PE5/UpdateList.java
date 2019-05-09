//1. Write a Java program to update specific array element by given element and empty the array list.
//        Input: [Apple, Grape, Melon, Berry]
//        Output: [Kiwi, Grape, Mango, Berry]
//        Array list after removing all elements []

package com.stackroute.PE5;

import java.util.ArrayList;
import java.util.List;

public class UpdateList
{
    public void listUpdate()
    {
        List<String> list=new ArrayList<String>();
        list.add("Apple");
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");
        System.out.println(list);

//        replace list value with respective index
        list.set(0,"Kiwi");
        list.set(2, "Mango");
        System.out.println(list);

//        remove all elements from the list
        list.removeAll(list);
        System.out.println("After removing all elements"+ list);
    }

    public static void main(String[] args)
    {
        UpdateList updateList=new UpdateList();
        updateList.listUpdate();
    }
}
