package com.example.algorithm.ssafy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tc; i++) {
            int N = Integer.parseInt(br.readLine());

            ArrayList<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < (N * 2); j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            ArrayList<Integer> discount = new ArrayList<>();

            while (!list.isEmpty()){
                int tmp = list.get(list.size() - 1);
                int dis = tmp / 4 * 3;

                if (list.contains(dis)){
                    list.remove(list.size() - 1);
                    list.remove(list.indexOf(dis));

                    discount.add(dis);
                }
            }

            Collections.sort(discount);

            for (int a :
                    discount) {
                System.out.print(a + " ");
            }
        }
    }

}
