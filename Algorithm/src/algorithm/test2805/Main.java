package algorithm.test2805;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long tree[] = new long[(int)N];
        for(int i=0; i<N; i++){
            tree[i] = sc.nextInt();
        }
        Arrays.sort(tree);
        int cnt = tree.length-1;
        long topnal = tree[cnt];
        long sum = Arrays.binarySearch(tree, topnal);
        System.out.println(sum);
    }

    static long  cutTree(long arr[], long topnal){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            long temp =  arr[i] - topnal;
            if(temp>0)
                sum += temp;
        }
        return sum;
    }
}
