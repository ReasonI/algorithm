import java.io.*;
import java.util.HashMap;

public class Main_1157 {

    static boolean check = false;
    static char maxWord;
    static Integer maxVal = Integer.MIN_VALUE;

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char alpha = word.charAt(i);

            if (hm.containsKey(alpha)) hm.put(alpha, hm.get(alpha) + 1);
            else hm.put(alpha, 1);
        }

        hm.forEach((key, value) -> {
            if (maxVal.equals(value)) check = true;
            else if (maxVal < value) {
                check = false;
                maxVal = value;
                maxWord = key;
            }

        });

        if (check) {
            System.out.println("?");
            return;
        } else System.out.println(maxWord);

        br.close();

    }

}
