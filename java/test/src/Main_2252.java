import java.io.*;
import java.util.*;

public class Main_2252 {

    static int N;
    static int M;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] edgesNum = new int[N + 1]; //edgesNum 배열

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < N + 1; i++){ //그래프
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < M ; i++){ //그래프 초기화
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int vertex1 = Integer.parseInt(st2.nextToken());
            int vertex2 = Integer.parseInt(st2.nextToken());

            graph.get(vertex1).add(vertex2);
            edgesNum[vertex2]++;
        }
        topologicalSort(edgesNum, graph);

    }

    static void topologicalSort(int[] edgesNum, ArrayList<ArrayList<Integer>> graph){

        Queue<Integer> zeroIndegree = new LinkedList<>();

        for(int i = 1; i < N + 1; i++){ // 먼저 indegree가 0인 vertex 먼저 넣
            if(edgesNum[i] == 0){
                zeroIndegree.add(i);
            }
        }

        for(int i = 0; i < N; i++){
            int vertex = zeroIndegree.remove();
            System.out.print(vertex + " ");

            for(int nextV : graph.get(vertex)){
                edgesNum[nextV]--;

                if(edgesNum[nextV] == 0){
                    zeroIndegree.add(nextV);
                }
            }
        }

    }
}