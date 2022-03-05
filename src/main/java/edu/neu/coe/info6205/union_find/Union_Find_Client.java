package edu.neu.coe.info6205.union_find;

import edu.neu.coe.info6205.graphs.BFS_and_prims.StdRandom;
import java.util.Scanner;

public class Union_Find_Client {

    public static void main(String arg[]) {

        Scanner ip = new Scanner(System.in);
        System.out.print("Enter site count: ");
        int site = ip.nextInt();
        int t=25;
        for(int i=site;i<100000;i = i + 500) {
            double sum=0;
            for (int j=0;j<t;j++)
                sum+=count(i);
            System.out.println("no. of Sites : " + i + ", no. of Runs: " + sum/t);
        }
    }

    public static int count(int n) {
        UF_HWQUPC uf = new UF_HWQUPC(n);
        int m = 0;
        while(uf.components() > 1) {
            int a= StdRandom.uniform(n),b=StdRandom.uniform(n);
            if(!uf.isConnected(a,b))
                uf.union(a,b);
            m++;
        }
        return m;
    }
}
