package com.test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Thief_data {
    public static int thief(String s) {
        int count = 1;
        char[] arr = s.toCharArray();
        boolean flag = arr[0] != '1';
        for (char c : arr) {
            if (flag && c == '1') {
                    count += 1;
                    flag = false;
            }
            if (!flag && c == '0') {
                    count += 1;
                    flag = true;
                }
        }return count;
    }
    public static void main (String[] args)
            throws IOException
    {
        List<String> listOfStrings = new ArrayList<>();
        File file = new File("untitled/src/main/resources/Thief_data.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\n");
        while(sc.hasNext()) {
            listOfStrings.add(sc.next());
        }
        for (String s : listOfStrings){
            System.out.println(thief(s));
        }
    }
}