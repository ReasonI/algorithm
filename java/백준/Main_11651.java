import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_11651 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[][] numArray = new int[num][2];

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            numArray[i][0] = Integer.parseInt(st.nextToken());
            numArray[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numArray, new Comparator<int[]>(){
            public int compare(int[] e1, int[] e2){
                if(e1[1] == e2[1]){
                    return e1[0] - e2[0];
                }else{
                    return e1[1] - e2[1];
                }
            }
        });

        for (int[] temp : numArray) {
            System.out.println(temp[0] + " " + temp[1]);
        }

        br.close();

    }

}