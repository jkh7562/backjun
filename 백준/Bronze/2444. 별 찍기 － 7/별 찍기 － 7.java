import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){ //정방향 출력
            for(int j=0 ; j < n-i; j++) //최대 갯수 부터 여백 출력
                System.out.printf(" ");
            for(int j=0 ; j < i + (i-1) ; j++) //현재 단계의 두배보다 1적은 만큼 별출력
                System.out.printf("*");
            System.out.println();
        }

        for(int i=n-1 ; i>0 ; i--){ //역방향 출력
            for(int j = 0 ; j < n-i; j++) //최소 갯수 부터 여백 출력(정방향 출력일 때와 같은 반복문 형태이지만 i의 값에 따라 달라짐)
                System.out.printf(" ");
            for(int j=0 ; j < i + (i-1) ; j++)
                System.out.printf("*");
            System.out.println();
        }
    }
}
