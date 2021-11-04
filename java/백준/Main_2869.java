import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2869 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int length = Integer.parseInt(st.nextToken());

        int cal = 0;

        cal = (length - night) / (day - night);

        if ((length - night) % (day - night) != 0) cal++;

        System.out.print(cal);

    }

}