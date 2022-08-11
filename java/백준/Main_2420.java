
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2420 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long subDomain1 = Long.parseLong(st.nextToken());
        long subDomain2 = Long.parseLong(st.nextToken());

        System.out.println(Math.abs(subDomain1 - subDomain2));

    }

}

