import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] s = new int[n];

        for(int i = 0; i < n ; i++){
            s[i] = sc.nextInt();
        }

        int min = 1000000;
        int max = 2;

        for(int i = 0; i < n ; i++){
            if(s[i] <= min){
                min = s[i];
            }
            if(s[i] >= max){
                max = s[i];
            }
        }
        System.out.printf("%d", min * max);

    }
}
