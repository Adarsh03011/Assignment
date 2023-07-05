package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Thief_data {
    public static int thief(String s) {
        int count = 0;
        boolean flag;
        int c_count = 0;
        int s_count = 0;
        HashMap<String,Integer> hs = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char c:arr){
            if (c=='0'){
                hs.put("0",c_count+1);
                c_count += 1;
            }
            else{
                hs.put("1",s_count+1);
                s_count += 1;
            }
        }if (hs.get("0") != null) {
            if (arr.length == hs.get("0")) {
                count = 1;
            }
        }
        if (arr[0] == '1')
            flag = false;
        else
            flag = true;
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