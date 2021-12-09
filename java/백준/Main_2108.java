import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Main_2108 {

    static int num;
    static int[] numArray;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        num = Integer.parseInt(br.readLine());

        numArray = new int[num];

        for (int i = 0; i < num; i++) {
            numArray[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(arithmeticMean());
        System.out.println(median());
        System.out.println(mode());
        System.out.println(range());

    }

    public static int arithmeticMean() {

        double sum = 0;

        for (int i = 0; i < num; i++) {
            sum += numArray[i];
        }

        return (int) Math.round(sum / num);

    }

    public static int median() {
        Arrays.sort(numArray);
        return numArray[num / 2];
    }

    public static int mode() {

        if (num == 1) return numArray[0];

        int max = 0;


        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < num; i++) {
            hm.put(numArray[i], hm.getOrDefault(numArray[i], 0) + 1);
        }

        int[][] sortHm = new int[hm.size()][2];

        int i = 0;
        for (Integer key : hm.keySet()) {
            sortHm[i][0] = key;
            sortHm[i][1] = hm.get(key);
            i++;
        }

        Arrays.sort(sortHm, new Comparator<int[]>() {
            public int compare(int[] e1, int[] e2) {
                if (e1[1] == e2[1]) {
                    return e2[0] - e1[0];
                } else {
                    return e2[1] - e1[1];
                }
            }
        });

        max = sortHm[0][1];
        int maxV = max;
        int count = 0;

        while (maxV == max) {

            count++;
            if (count > sortHm.length - 1) break;
            maxV = sortHm[count][1];

        }

        if (count == 1) return sortHm[0][0];
        return sortHm[count - 2][0];

    }

    public static int range() {
        return numArray[num - 1] - numArray[0];
    }
}