package com.mystream;
import java.util.*;
import java.util.stream.*;
public class CusCollectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Customers> cusList =new ArrayList();
     cusList.add(new Customers("Peter","Joseph","abc@gmail.com",new Location("Mumbai","Maharashtra")));
     cusList.add(new Customers("Sam","Ross","abc@gmail.com",new Location("Pune","Maharashtra")));
     cusList.add(new Customers("Edgar","Gayles","xys@gmail.com",new Location("Chennai","TN")));
     
     
     List<String> cul_list= cusList.stream().map((e)->e.getFirstName()+" "+e.getLastName()+" "+e.getLocation()).collect(Collectors.toList());
     System.out.println(cul_list);
		
	}

}
