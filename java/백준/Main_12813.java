import java.io.*;

public class Main_12813 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();

        for(int i = 0; i < A.length(); i++){
            System.out.print( A.charAt(i) - '0' & B.charAt(i) - '0');
        }

        System.out.println("");

        for(int i = 0; i < A.length(); i++){
            System.out.print(A.charAt(i) - '0' | B.charAt(i) - '0');
        }

        System.out.println("");

        for(int i = 0; i < A.length();i++){
            System.out.print(A.charAt(i) - '0' ^ B.charAt(i) - '0');
        }

        System.out.println("");

        for(int i = 0; i < A.length();i++){
            System.out.print(A.charAt(i) - '0' ^ 1);
        }

        System.out.println("");

        for(int i = 0; i < B.length();i++){
            System.out.print( B.charAt(i) - '0' ^ 1);
        }


        br.close();

    }

}