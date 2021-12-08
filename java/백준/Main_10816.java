import java.util.Arrays;
import java.util.Scanner;

public class Main_10816 {

    static int[] NArray;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        NArray = new int[N];

        for (int i = 0; i < N; i++) {
            NArray[i] = sc.nextInt();
        }

        Arrays.sort(NArray);

        int M = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int target = sc.nextInt();
            sb.append(lowerBinarySearch(target) - upperBinarySearch(target)).append(' ');
        }

        System.out.println(sb);

    }

    public static int upperBinarySearch(int target) {

        int low = 0;
        int high = NArray.length;

        while (low < high) {
            int mid = (low + high) / 2;

            if (target <= NArray[mid]) high = mid;
            else low = mid + 1;

        }

        return low;

    }

    public static int lowerBinarySearch(int target) {

        int low = 0;
        int high = NArray.length;

        while(low < high) {
            int mid = (low + high) / 2;

            if(target < NArray[mid]) high = mid;
            else low = mid + 1;
        }

        return low;

    }

}