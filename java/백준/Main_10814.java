import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[][] ageArray = new String[num][2];

        StringTokenizer st;
        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());

            ageArray[i][0] = st.nextToken();
            ageArray[i][1] = st.nextToken();
        }

        Arrays.sort(ageArray, new Comparator<String[]>() {
            public int compare(String[] e1, String[] e2) {
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            }
        });

        for (String[] person : ageArray) {
            System.out.println(person[0] + " " + person[1]);
        }

    }
}