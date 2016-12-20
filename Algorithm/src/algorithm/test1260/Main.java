package algorithm.test1260;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int map[][] ;
    static int visit1[];
    static int visit2[] ;
    static int rear, front; // 전단과 후단
    static int queue[];

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        visit1 = new int[n+1];
        visit2 = new int[n+1];
        queue = new int[n+1];
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int v1, v2;
        for(int i=0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            v1 = Integer.parseInt(st.nextToken());
            v2 = Integer.parseInt(st.nextToken());
            map[v1][v2] = map[v2][v1] = 1;
        }
        System.out.print(start + " ");
        DFS(start);
        System.out.println();
        System.out.print(start + " ");
        BFS(start);
    }

    public static void DFS(int v){
        int i;
        visit1[v] = 1;
        for(i=1; i<=n; i++){
            if(map[v][i] == 1 && visit1[i]!=1){
                System.out.print(i + " ");
                DFS(i);
            }
        }
    }

    public static void BFS(int v){
        int i;
        visit2[v] = 1;
        queue[rear++] = v;
        while(front < rear){ // 후단이 전단과 같거나 작으면 루프탈출
            v = queue[front++];
            for(i=1; i<=n; i++){
                if(map[v][i] == 1 && visit2[i] !=1){
                    visit2[i] = 1;
                    System.out.print(i + " ");
                    queue[rear++] = i;
                }
            }
        }
    }
}
