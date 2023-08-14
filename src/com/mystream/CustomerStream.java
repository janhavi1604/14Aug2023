package com.mystream;
import java.util.*;
import java.util.stream.*;
public class CustomerStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> list=new ArrayList();
		list.add(new Customer("Peter","Mumbai","Simple",3,600));
		list.add(new Customer("Sam","Pune","Fast",4,600));
		list.add(new Customer("Max","Chennai","Simple",2,500));
		list.add(new Customer("Chris","Mumbai","Simple",3,600));
		
		Stream<Customer> stream=list.stream();
		stream.filter((e)->e.getPlanRange()>3).forEach(System.out::println);
		stream.filter((e)->e.getAmount()>600).forEach(System.out::println);
		
        
	
		System.out.println(stream.anyMatch((e)->e.getPlanRange()>300));
	}

}
