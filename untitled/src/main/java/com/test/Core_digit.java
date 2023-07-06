package com.test;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
        ArrayList<String> arr = new ArrayList<>();
        File file = new File("untitled/src/main/resources/Core_data.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter(" ");
        while(sc.hasNext()) {
            arr.add(sc.next());
        }
        String a = arr.get(0);
        int b = Integer.parseInt(arr.get(1));
        core(a,b);
    }
}