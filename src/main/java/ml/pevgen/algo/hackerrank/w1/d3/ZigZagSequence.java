package ml.pevgen.algo.hackerrank.w1.d3;

import java.util.Arrays;

public class ZigZagSequence {


    public void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = n/2;  // added -1 (ex: int mid = (n + 1)/2)
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;  // fix right first element (ex: int ed = n - 1;)
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;                   // fix reverse  (ex: ed = ed + 1)
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
