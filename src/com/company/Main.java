package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String s = " Phonebook";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
        {
            Character currVal = s.charAt(i);

            if (hashMap.containsKey(currVal))
            {
                hashMap.put(currVal,hashMap.get(currVal)+1);


            }else
            {

                hashMap.put(currVal,1);
            }

        }
        Character mostrepeated = ' ';
        int max = 0;
        for( Character key: hashMap.keySet())
        {

            int currentval =hashMap.get(key);
            if(currentval>max)
            {
                mostrepeated=key;
                max=currentval;
            }
        }
        System.out.println( "most repeated character is "+ mostrepeated + " for " + max + " times");

    }
}