package com.example.algorithm.ssafy.D2;

import java.util.Scanner;

/**
 * 1979. 어디에 단어가 들어갈 수 있을까
 */
public class Test1 {

    public int solution(int[][] list, int rc, int size){
        int ans = 0;

        // 가로
        for (int i = 0 ; i < rc ; i++ ){
            int temp = 0;
            for (int j = 0 ; j < rc ; j++){
                // 1. 검정일 때
                if (list[i][j] == 0){
                    if (temp == size){
                        ans += 1;
                    }
                    temp = 0;
                }
                else{
                        temp += 1 ;
                    }
                    if (temp == size) ans += 1;
                }
        }

        // 세로
        for (int i = 0 ; i < rc ; i++ ){
            int temp = 0;
            for (int j = 0 ; j < rc ; j++){
                // 1. 검정일 때
                if (list[j][i] == 0){
                    if (temp == size){
                        ans += 1;
                    }
                    temp = 0;
                }
                else{
                    temp += 1 ;
                }
                if (temp == size) ans += 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        Test1 test1 = new Test1();
        Scanner sc = new Scanner(System.in);

        int Tc = sc.nextInt();

        for (int i =0 ; i < Tc ; i++){

            int rc = sc.nextInt(); // row , column size
            int size = sc.nextInt();

            int[][] list = new int[rc][rc];

            for (int j = 0 ; j < rc ; j ++){
                for (int k = 0 ; k < rc; k ++){
                    list[j][k] = sc.nextInt();
                }
            }
            int p = i +1;
            System.out.println("#"+p+" " + test1.solution(list,rc, size));
        }
    }

}
