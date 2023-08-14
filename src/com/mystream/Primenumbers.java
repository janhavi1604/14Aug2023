package com.mystream;
import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Primenumbers {
	static boolean isPrime(int number)
	{
		return number>1 && IntStream.range(2, number).noneMatch(i->number%i==0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean primeyn=isPrime(10);
		System.out.println(primeyn);
}}