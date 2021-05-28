import java.io.*;

public class Main_2447 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter((System.out))));

        int N = Integer.parseInt(br.readLine());
        String arr[][] = new String[N][N];

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                arr[i][j] = " ";
            }
        }
        star(arr, 0, 0, N);

        for (String[] stars : arr){
            for (String star : stars){
                bw.write(star +"");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }

    public static void star(String[][] arr, int x, int y , int N){
        if (N == 1) {
            arr[x][y] = "*";
            return;
        }

        for (int i = 0; i < 3; i++){
            for( int j = 0; j < 3; j++){
                if (!(i == 1 && j == 1)){
                    star(arr, x+i* (N/3), y+j*(N/3),N/3);
                }
            }

        }
    }
}