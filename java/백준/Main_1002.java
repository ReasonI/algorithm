import java.io.*;
import java.util.*;

public class Main_1002 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int caseNum = Integer.parseInt(br.readLine());
        int[] answer = new int [caseNum];

        for(int i = 0; i < caseNum; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distancePow = (int) Math.pow(x1-x2,2)+ (int)Math.pow(y1-y2,2);

            //무한(일치)
            if(x1 == x2 && y1 == y2 && r1 == r2){
                answer[i] = -1;
            } else if(distancePow > Math.pow(r1 + r2,2)){ //접점X, 원 밖
                answer[i] = 0;
            } else if(distancePow < Math.pow(r1 - r2,2)){ // 접점X, 원 안
                answer[i] = 0;
            } else if(distancePow == Math.pow(r1 - r2,2) || distancePow == Math.pow(r1 - r2,2)){ //내접 >> 두점거리 == r2- r1 or 두점거리 == r1 - r2
                answer[i] = 1;
            } else if(distancePow == Math.pow(r1 + r2,2)){ //외접 >> 두점거리 == r1 + r2
                answer[i] = 1;
            } else {
                answer[i] = 2;
            }

        }

        for(int i : answer)
            System.out.println(i);

        br.close();
    }
}