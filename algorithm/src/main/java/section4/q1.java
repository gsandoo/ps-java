package section4;
import java.util.Scanner;
public class q1 {
    public int solution(int n , int m , int[] arr) {
        int answer=0 , sum = 0;
        for (int i = 0 ; i < m ; i++){
            sum += arr[i];
        }
        answer = sum;

        for (int i = m ; i < n ; i++){
            sum +=(arr[i]-arr[i-m]);
            if (answer < sum) answer = sum;
        }
        return  answer;
    }

    public static void main(String[] args) {
        q1 T = new q1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n , m , arr));
    }
}
