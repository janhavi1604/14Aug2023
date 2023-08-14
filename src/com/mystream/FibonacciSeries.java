package com.mystream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Stream.iterate(new int[]{0,1}, f -> new int[]{f[1], f[0]+f[1]}) .limit(15) .map(n -> n[0]) .forEach(fibNum -> System.out.print(fibNum + " ")); 
	    }
	
}
