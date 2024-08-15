package com.algorithm.inflearn.section9.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 계단 오르기
 */
public class q1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        int result = 0;
        for (int i = 3 ; i <= T ;i++){
            result += list.get(i-2) + list.get(i-3);
            list.add(result);
            result = 0;
        }
        System.out.println(list.get(T-1));
    }
}
