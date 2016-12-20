package search.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by FocusNews on 2016-11-23.
 */
public class BfsTest {
    static int n; // 입력되는 정점의 최대값
    static int rear, front; // 전단과 후단
    static int map[][] = new int[30][30]; // 인접행렬
    static int queue[] = new int[30];
    static int visit[] = new int[30];

    public static void main(String[] args) throws IOException{
        int start;
        int v1, v2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        while(true){
            st = new StringTokenizer(br.readLine());
            v1 = Integer.valueOf(st.nextToken());
            v2 = Integer.valueOf(st.nextToken());
            if(v1 == -1 && v2 == -1) break;
            map[v1][v2] = map[v2][v1] = 1;
        }
        BFS(start);
    }

    public static void BFS(int v){
        int i;
        visit[v] = 1;
        System.out.println(v + "에서 시작");
        queue[rear++] = v;
        while(front < rear){ // 후단이 전단과 같거나 작으면 루프탈출
            v = queue[front++];
            for(i=1; i<=n; i++){
                if(map[v][i] == 1 && visit[i] !=1){
                    visit[i] = 1;
                    System.out.println(v + "에서 " + i + "로 이동");
                    queue[rear++] = i;
                }
            }
        }
    }
}