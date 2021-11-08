import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main_1181 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String[] wordArray = new String[num];

        for(int i = 0; i < num; i++){
            wordArray[i] = sc.next();
        }

        Arrays.sort(wordArray, new Comparator<String>(){

            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) return o1.compareTo(o2);

                else return o1.length() - o2.length();

            }
        });

        System.out.println(wordArray[0]);
        for(int i = 1; i < num; i++){
            if(wordArray[i].equals(wordArray[i-1])) continue;
            System.out.println(wordArray[i]);
        }
    }

}