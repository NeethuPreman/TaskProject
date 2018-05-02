package com;

import java.math.BigInteger;

public class Power_big_integer {
	public static void main(String[] args) {
	BigInteger power = poweroftwo(1000);
	System.out.println(power);
	int sum = sumofdigits(power);
	System.out.println("sum of digits="+sum);
	}
	private static BigInteger poweroftwo(int j) {
	BigInteger two=new BigInteger("2");
	BigInteger power=two.pow(j);
	return power;
	}
	private static int sumofdigits(BigInteger power) {
		int sum=0;
		while(power.bitLength()>0) {
			sum+=power.remainder(new BigInteger("10")).intValue();
			power=power.divide(new BigInteger("10"));
		}
		return sum;
	
}
}
