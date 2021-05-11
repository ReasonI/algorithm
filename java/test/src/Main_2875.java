import java.io.*;
import java.util.StringTokenizer;

public class Main_2875 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int women = Integer.parseInt(st.nextToken());
        int men = Integer.parseInt(st.nextToken());
        int intern = Integer.parseInt(st.nextToken());

        int maxTeam = (women + men - intern) / 3;
        if(maxTeam > men){
            maxTeam = men;
        }else if(maxTeam > women/2){
            maxTeam = women/2;
        }
        bw.write(maxTeam +"" );

        bw.flush();

        br.close();
        bw.close();
    }
}