import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int x = 0;
        int y = 0;

        int min = Integer.MAX_VALUE;

        boolean[][] chess = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();

            for (int j = 0; j < M; j++) {
                if (temp.charAt(j) == 'W') chess[i][j] = true;
                else chess[i][j] = false;
            }

        }

        while (true) {
            if (y + 8 > N) break;
            if (x + 8 > M) {
                x = 0;
                y++;
                continue;
            }

            boolean color = chess[y][x];
            int count = 0;

            for (int i = y; i < y + 8; i++) {

                for (int j = x; j < x + 8; j++) {

                    if (chess[i][j] != color) count++;

                    color = !color;

                }
                color = !color;

            }

            count = Math.min(count, 64 - count);
            min = Math.min(count, min);

            x++;

        }

        System.out.print(min);

    }
}