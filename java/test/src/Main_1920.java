import javax.print.attribute.standard.MediaSize;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920 {

    static int[] NArray;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N;
        int M;

        N = Integer.parseInt(br.readLine());
        NArray = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            NArray[i] = Integer.parseInt(st.nextToken());
        }

        M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());


        Arrays.sort(NArray);

        for(int i = 0; i < M; i++){

            if(binarySearch(Integer.parseInt(st.nextToken()))) System.out.println("1");
            else System.out.println("0");

        }

    }

    public static boolean binarySearch(int target){

        int low = 0;
        int high = NArray.length - 1;

        while(low <= high){

            int mid = (low + high) / 2;

            if(target < NArray[mid]) high = mid - 1;
            else if(target > NArray[mid]) low = mid + 1;
            else return true;

        }

        return false;

    }
}