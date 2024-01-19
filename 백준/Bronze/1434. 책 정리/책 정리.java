import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] N = new int[n];
        int[] M = new int[m];

        int Nrst=0;
        int Mrst=0;

        for(int i = 0; i < n; i++){
            N[i] = sc.nextInt();
            Nrst += N[i];
        }

        for(int i = 0; i < m; i++){
            M[i] = sc.nextInt();
            Mrst += M[i];
        }

        System.out.println(Nrst - Mrst);
    }
}
