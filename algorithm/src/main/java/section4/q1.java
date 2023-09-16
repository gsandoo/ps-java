package section4;
import java.util.HashMap;
import java.util.Scanner;

// 해시
public class q1 {
    public int solution(int n , String arr) {
        int answer=0;
        HashMap<String , Integer> hashMap = new HashMap<>();
        hashMap.put("A" , 1);
        hashMap.put("B" , 1);
        hashMap.put("C" , 1);
        hashMap.put("D" , 1);
        hashMap.put("E" , 1);

        return  answer;
    }

    public static void main(String[] args) {
        q1 T = new q1();
        int n = 15;
        String arr = "BACBACCACCBDEDE";
        System.out.println(T.solution(n , arr));
    }
}
