import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double arr[] = new double[sc.nextInt()];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
        }
        sc.close();

        double sum = 0;
        Arrays.sort(arr); //오름차순 정렬

        for(int i = 0; i < arr.length; i++) {
            sum += ((arr[i] / arr[arr.length-1]) * 100); //최대값에 100을 곱해 현재 과목 점수에 나누어 조작
        }
        System.out.print(sum / arr.length);
    }
}
