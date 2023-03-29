/*大整数相加*/
package ch06;

import java.math.BigInteger;
import java.util.Scanner;

public class ch06_1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        while(input.hasNextBigInteger()){
            BigInteger a=input.nextBigInteger();
            BigInteger b=input.nextBigInteger();
            System.out.println(a.add(b));
        }
    }
}