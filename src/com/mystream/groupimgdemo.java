package com.mystream;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class groupimgdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customet> cusList =new ArrayList();
	     cusList.add(new Customet(1,new Product("Coffee",320,3,true,"abc"),300,3,"Mumbai"));
	     cusList.add(new Customet(2,new Product("Tea",420,2,true,"xyz"),400,4,"Delhi"));
	     cusList.add(new Customet(3,new Product("Juice",150,3,false,"jkl"),100,3,"Mumbai"));
	     cusList.add(new Customet(4,new Product("Coffee",500,1,true,"kmn"),250,3,"Mumbai"));
	     cusList.add(new Customet(5,new Product("Tea",620,3,false,"pos"),320,3,"Delhi"));
	     cusList.add(new Customet(6,new Product("Juice",320,3,true,"qisu"),300,3,"Mumbai"));
	  
	    /*Map mynew=  cusList.stream().collect(Collectors.groupingBy(Customet::getPayment_type));
        System.out.println(mynew);
	   */
	   /* Map<String, java.util.List<Customet>>mylistmap=cusList.stream().collect(Collectors.groupingBy(Customet::getLocation));
	   	     for(String s:mylistmap.keySet())
	     {
	    	 System.out.println(s);
	    	 java.util.List<Customet> culist= mylistmap.get(s);
	    	 for(Customet c:culist)
	    	 {
	    		 System.out.println(c);
	    	 }
	    		 
	     }
	     */
	    /* Map mynew=  cusList.stream().collect(Collectors.groupingBy(Customet::getProductName));
	        System.out.println(mynew);
	      */  
	   
	   	    	    		 
		     
	   	     
	}

	

}