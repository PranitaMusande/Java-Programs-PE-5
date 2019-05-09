//3. Write a program where an array of strings is input and output is a Map<String,boolean> where
//        each different string is a key and its value is true if that string appears 2 or more times in the array
//        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

package com.stackroute.PE5;

import java.util.*;

public class MapString
{
    public void stringCount()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String input=scanner.nextLine();

        List<String> stringList=new ArrayList<>();
        stringList= Arrays.asList(input.split("[\\W_]+"));

        Map<String,Integer> map=new HashMap<>();
        for(String each:stringList)
        {
            if(map.containsKey(each))
            {
                map.replace(each,map.get(each)+1);
            }else{
                map.put(each,1);
            }
        }

        // new HashMap for output

        Map<String,Boolean> Map1=new HashMap<>();
        for(String each:map.keySet())
        {
            if(map.get(each)>=2)
            {
                Map1.put(each,true);
            }else {
                Map1.put(each,false);
            }
        }
        System.out.println(Map1.toString());

    }

    public static void main(String[] args)
    {
        MapString mapString=new MapString();
        mapString.stringCount();
    }
}
