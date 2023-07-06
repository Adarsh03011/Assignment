package com.test;// import necessary packages
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
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
        ArrayList<String> arr = new ArrayList<>();
        File file = new File("untitled/src/main/resources/Exam_data.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\n");
        while(sc.hasNext()) {
            arr.add(sc.next());
        }
        for (int i = 0;i < arr.size()-1;i++){
            String a = arr.get(i);
            Pattern p  = Pattern.compile(",");
            List<String> ch1 = Arrays.asList(p.split(a));
            String K = ch1.get(0).trim();
            String L = ch1.get(1).trim();
            String M = ch1.get(2).trim();
            System.out.println(preparation(K,L,M));
        }
    }
}