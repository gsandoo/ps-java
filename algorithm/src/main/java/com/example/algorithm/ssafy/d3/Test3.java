package com.example.algorithm.ssafy.d3;

import java.util.*;

/**
 * 19113. 식료품 가게
 */
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
/**
 *
 2
 3 15 20 60 75 80 100 -> 15 60 75
 4 90 90 120 120 120 150 160 200 -> 90 90 120 150
 */
        int num = 0;
        ArrayList<String> resultList = new ArrayList<>();
        List<String> answerList = new ArrayList<>();
        for (String[] x : list){
            num++;
            List<String> temp = new ArrayList<>(Arrays.asList(x));
            while (temp.size() >= 2){
                int val  = Integer.parseInt(temp.get(temp.size()-1));
                int dis = val/4*3;
                if (temp.contains(String.valueOf(dis))){
                    resultList.add(String.valueOf((dis)));
                    temp.remove(String.valueOf(val));
                    temp.remove(String.valueOf(dis));
                }
            }
            Collections.sort(resultList);

            answerList.add("#"+num+" ");
            answerList.addAll(resultList);
            resultList.clear();
        }

        for (int i = 0 ; i < answerList.size(); i++){
            if (answerList.get(i).contains("#")) System.out.println();
            System.out.print(answerList.get(i));
            System.out.print(" ");
        }
    }
}
