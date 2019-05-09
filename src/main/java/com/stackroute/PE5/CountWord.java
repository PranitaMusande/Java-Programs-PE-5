//2. Write a program to find the number of counts in the following String. Store the output in
//        Map<String,Integer> as key value pair.
//        Input : String str = “one one -one___two,,three,one @three*one?two”;
//        Output : {"one":5 , "two":2, "three" :2}

package com.stackroute.PE5;

import java.util.*;

public class CountWord
{
    public void wordCount()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=scanner.nextLine();
        List<String> StringList=new ArrayList();
        StringList = Arrays.asList(input.split("[\\W_]+"));

//    Map<String,Integer> as key value pair.
        Map<String, Integer> StringCount = new HashMap<>();
        for (String each : StringList)
        {

            if (StringCount.containsKey(each))
            {
                StringCount.replace(each, StringCount.get(each) + 1);
            }
            else
                {
                StringCount.put(each, 1);
            }
        }
        System.out.println(StringCount);

    }

    public static void main(String[] args)
    {
        CountWord countWord=new CountWord();
        countWord.wordCount();
    }
}
