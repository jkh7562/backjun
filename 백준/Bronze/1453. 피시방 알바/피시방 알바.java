import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] N = new int[n];
        int cnt = 0;

        for(int i = 0 ; i < n ; i++){
            N[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            int tmp = N[i];
            for(int j = i+1 ; j < n ; j++){
                if(tmp == N[j]){
                    cnt++;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
