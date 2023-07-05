package com.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class Core_digit {
    public static void core(String s,int t){
        char [] ch = String.valueOf(s).toCharArray();
        ArrayList<Integer> arr = new ArrayList<>();
        for(char c: ch){
            arr.add(Integer.parseInt(String.valueOf(c)));
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        if (sum>10){
            core(String.valueOf(sum),t);
        }
        else{
            if (t == 1){
                System.out.println(sum);
            }
            else {
                sum = sum * t;
                t = 1;
                core(String.valueOf(sum), t);
            }
        }
    }
    public static void main(String[] args)
            throws IOException
    {
        List<String> Strings = new ArrayList<>();
        FileReader fr = new FileReader("Core_data.txt");
        StringBuilder sb = new StringBuilder();
        char ch;
        while (fr.ready()) {
            ch = (char)fr.read();
            if (ch == ' ') {
                Strings.add(sb.toString());
                sb.setLength(0);
            }
            else {
                sb.append(ch);
            }
        }
        if (sb.length() > 0) {
            Strings.add(sb.toString());
        }
        String a = Strings.get(0);
        int b = Integer.parseInt(Strings.get(1));
        core(a,b);
    }
}

