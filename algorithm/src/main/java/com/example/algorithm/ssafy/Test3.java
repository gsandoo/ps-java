package com.example.algorithm.ssafy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 2
        ArrayList<String[]> list = new ArrayList<>(); // [[1, 2, 3 ,4 ,5 ,6] , [ . . . . .]]
        for (int i = 0 ; i < T ; i ++){
            int P = sc.nextInt(); // 3

            sc.nextLine(); // 개행
            String num = sc.nextLine();
            String[] words = new String[P*2];
            words = num.split(" ");
            list.add(words);
        }
        ArrayList<String> resultList = new ArrayList<>();
/**
 *
 2
 3 15 20 60 75 80 100
 4 90 90 120 120 120 150 160 200
 */
        int num = 0;

        for (String[] x : list){
            num++;
            resultList.add("#"+num+" ");
            List<String> temp = new ArrayList<>(Arrays.asList(x));
            for (int i = 0 ; i < temp.size() ; i++){

                int Q = Integer.parseInt(temp.get(i)) * 4 / 3 ;

                for (int h = 0 ; h < temp.size() ; h++){
                    int G = Integer.parseInt(temp.get(h));
                    if (Q == G){
                        resultList.add( temp.get(i));
                        temp.remove(i);
                        i--;
                        break;
                    }
                }
            }
        }
        for (int i = 0 ; i < resultList.size(); i++){

            System.out.print(resultList.get(i));
            System.out.print(" ");
        }
    }
}
