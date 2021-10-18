import java.io.*;

public class Main_3052 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());

            check[num % 42] = true;

        }

        for(boolean yes : check){
            if(yes) count++;
        }
        System.out.print(count);


        br.close();

    }
}
