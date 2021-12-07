import java.util.Arrays;
import java.util.Scanner;

public class Main_10816 {

    static int[] NArray;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        NArray = new int[N];

        for(int i = 0; i < N; i++){
            NArray[i] = sc.nextInt();
        }

        Arrays.sort(NArray);

        int M = sc.nextInt();

        for(int i = 0; i < M; i++){
            int target = sc.nextInt();
            System.out.print(upperBinarySearch(target) - lowerBinarySearch(target) + " ");
        }

    }

    public static int upperBinarySearch(int target){

    }

    public static int lowerBinarySearch(int target){

    }



}