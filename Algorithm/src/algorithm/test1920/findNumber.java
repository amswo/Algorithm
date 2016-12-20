package algorithm.test1920;

import java.io.*;
import java.util.*;

public class findNumber {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++)
            A[i] = sc.nextInt();
        Arrays.sort(A);
        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int temp = sc.nextInt();
            int num = (Arrays.binarySearch(A, temp) >= 0 ? 1 : 0);
            System.out.println(num);
        }
    }
}
