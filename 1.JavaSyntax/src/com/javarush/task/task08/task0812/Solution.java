package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> intList = new ArrayList<Integer>();
        System.out.println(filterList(addList(intList)));
    }

    public static List<Integer> addList(List<Integer> list) throws IOException {
        for (int i = 0; i < 10; i++) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int data = Integer.parseInt(bufferedReader.readLine());
            list.add(data);
        }
        return list;
    }

    public static int filterList(List<Integer> list) {
        int count = 0;
        int countItog = 0;
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                int b = list.get(j);
                if (a == b)  {
                    count++;
                    if (count > countItog) {
                        countItog = count;
                    }
                }
                if (a != b) {
                    count = 0;
                }
            }
        }
        return countItog;
    }
}

