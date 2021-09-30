import java.io.*;
import java.util.Arrays;

public class Main_2309 {

    static int[] height;
    static int[] found;
    static boolean check = false;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        height = new int[9];
        found = new int[7];

        for (int i = 0; i < 9; i++) {
            height[i] = Integer.parseInt(br.readLine());
        }

        dfs(0, 0, 0);

        Arrays.sort(found);

        for (int dwarf : found) {
            System.out.println(dwarf);
        }

        br.close();

    }

    public static void dfs(int sum, int count, int i) {

        if(check) return;

        if (count == 7){
            if(sum == 100) check = true;
            return;
        }

        if(i >= 9) return;

        if(sum > 100) return;

        found[count] = height[i];

        dfs(sum + height[i], count + 1, i + 1);

        dfs(sum, count, i + 1);


    }
}
