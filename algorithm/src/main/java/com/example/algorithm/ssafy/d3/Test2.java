package com.example.algorithm.ssafy.d3;

import java.util.ArrayList;

import java.util.Scanner;

/*20019. 회문의 회문*/
public class Test2 {


    public static void main(String[] args) {
        int num = 1;
        String result = "NO";

        ArrayList<String> r = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int times = scanner.nextInt();

        for (int i = 0 ; i < times ; i ++){
            String words = scanner.next();
            arrayList.add(words);
        }

        for (String x : arrayList){

            String[] k = x.split("");

            if (k.length %2 == 1){
                int T = (x.length() - 1)/ 2;
                StringBuilder sbab = new StringBuilder();
                StringBuilder sbcd = new StringBuilder();

                // 앞
                for (int i = 0 ; i < T ; i++){
                    sbab.append(k[i]);
                }

                // 뒤
                for (int t = T+1 ;t < k.length ; t ++){
                    sbcd.append(k[t]);
                }

                if (sbab.toString().contentEquals(sbcd)) result = "YES";

                r.add("#"+ num + " " + result);
                num ++;
            }else result = "NO";
        }

        for (int i = 0 ; i < r.size() ; i++){
            System.out.println(r.get(i));
        }

    }
}
