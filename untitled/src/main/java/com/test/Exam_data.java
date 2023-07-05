package com.test;// import necessary packages
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Exam_data {
    public static String preparation(String x,String y, String z){
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);
        if (a*b <= c)
            return "Yes";
        else
            return "No";
    }
    public static void main(String[] args)
            throws IOException
    {
        List<String> listOfStrings = new ArrayList<>();
        FileReader fr = new FileReader("Exam_data.txt");
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
        for (int i = 0;i < listOfStrings.size()-1;i++){
            String a = listOfStrings.get(i);
            Pattern p  = Pattern.compile(",");
            List<String> ch1 = Arrays.asList(p.split(a));
            String K = ch1.get(0).trim();
            String L = ch1.get(1).trim();
            String M = ch1.get(2).trim();
            System.out.println(preparation(K,L,M));
        }
    }
}
