package com.example.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseList {

	public static<T> void reverseList(List<T> list)
    {
        // base case: the list is empty, or only one element is left
        if (list == null || list.size() <= 1) {
            return;
        }
 
        // remove the first element
        T value = list.remove(0);
 
        // recur for remaining items
        reverseList(list);
        // insert the top element back after recurse for remaining items
        list.add(value);
    }
 
    public static void main(String[] args)
    {
        List<String> colors = new ArrayList<>(Arrays.asList("RED", "BLUE", "BLACK"));
 
        reverseList(colors);
        System.out.println(colors);
    }
}
