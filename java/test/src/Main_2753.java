import java.io.*;

public class Main_2753 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        boolean check = false;

        if (year % 400 == 0) check = true;

        if (year % 4 == 0 && year % 100 != 0) check = true;

        if (check) System.out.print("1");
        else System.out.print("0");

        br.close();

    }
}
