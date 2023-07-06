package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Thief_data {
    public static int thief(String s) {
        int count = 1;
        char[] arr = s.toCharArray();
        boolean flag = (arr[0] == '1') ? false:true;
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
        FileReader fr = new FileReader("untitled/src/main/resources/Thief_data.txt");
        StringBuilder sb = new StringBuilder();
        char ch;
        while (fr.ready()) {
            ch = (char)fr.read();
            if (ch == '\n') {
                listOfStrings.add(sb.toString());
                sb.setLength(0);
            }
            else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) {
            listOfStrings.add(sb.toString());
        }
        for (int i = 0;i< listOfStrings.size();i++){
            String a = listOfStrings.get(i);
            System.out.println(thief(a));
        }
    }
}