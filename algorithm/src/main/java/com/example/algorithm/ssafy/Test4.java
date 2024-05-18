package com.example.algorithm.ssafy;

/**
 * 1859. 백만 장자 프로젝트
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 25년 간의 수행 끝에 원재는 미래를 보는 능력을 갖게 되었다. 이 능력으로 원재는 사재기를 하려고 한다.
 *
 * 다만 당국의 감시가 심해 한 번에 많은 양을 사재기 할 수 없다.
 *
 * 다음과 같은 조건 하에서 사재기를 하여 최대한의 이득을 얻도록 도와주자.
 *
 *     1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
 *     2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
 *     3. 판매는 얼마든지 할 수 있다.
 *
 * 예를 들어 3일 동안의 매매가가 1, 2, 3 이라면 처음 두 날에 원료를 구매하여 마지막 날에 팔면 3의 이익을 얻을 수 있다.
 *
 *
 *
 *
 * 입력
 * 3
 * 3
 * 10 7 6
 * 3
 * 3 5 9
 * 5
 * 1 1 3 1 2
 * input.txt
 * 출력
 * #1 0
 * #2 10
 * #3 5
 *
 *
 * 해결방법
 * 1. 배열에 있는 값 중 가장 큰 값을 찾는다.
 * 2. 그 기준으로 for 문을 돈다.
 * 3. max 값 - i 번째 값을 result 에 담는다.
 * 4. 출력한다.
 *
 */
public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 3
        List<Integer> result = new ArrayList<>();
        for (int i = 0 ; i < T  ; i++){
            sc.nextLine();
            int num = sc.nextInt();



            sc.nextLine();
            String number = sc.nextLine();
            String [] word = number.split(" ");
            List<Integer> nn = new ArrayList<>();
            for (int p = 0 ; p < word.length ; p++){
                nn.add(Integer.parseInt(word[p]));
            }

            Collections.sort(nn); // 오름차순
            int r = 0;
            for (int k = 0 ; k < nn.size(); k++){
                r += (nn.get(nn.size() - 1)) - (nn.get(k));
            }
            result.add(r);

        }

        int t= 1;
        for (int p = 0 ; p < result.size(); p++){
            System.out.println("#"+t+ " " + result.get(p));
        }
    }
}
