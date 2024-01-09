import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int rst = 1;

        for(int i = n ; i > 1 ; i--){
            rst = rst*i;
        }

        System.out.println(rst);
    }
}
