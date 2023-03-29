package main;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNext()){
            int n=input.nextInt();
            BigInteger ans=new BigInteger("1");
            for(int i=1;i<=n;++i){
                ans=ans.multiply(BigInteger.valueOf(i));
            }
            System.out.println(ans);
        }
    }
}