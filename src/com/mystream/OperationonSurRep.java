package com.mystream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class OperationonSurRep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SurveyReport> list=new ArrayList();
		list.add(new SurveyReport(1,"Peter","Mumbai",3,5,5));
		list.add(new SurveyReport(2,"Sam","Delhi",4,3,5));
		list.add(new SurveyReport(3,"Max","Chennai",5,2,3));
		list.add(new SurveyReport(4,"Chris","Delhi",3,3,5));
		
		/*int i=list.stream().map((e)->e.getNo_of_days_for_request_completion()).reduce(0,(a,b)->a+b/list.size());
		System.out.println(i);
		*/
		
		/*int i=list.stream().map((e)->e.getAverage_request_per_day()).reduce(0,(a,b)->a+b);
		System.out.println(i);
		*/
		
		Stream<SurveyReport> reportstream=list.stream();
	    Integer countd= (int) reportstream.filter((e)->(e).getLocation().equalsIgnoreCase("Delhi")).count();
	    System.out.println(countd);
	    
		/*Stream<SurveyReport> reportstream =list.stream();
		SurveyReport r= reportstream.max((d1,d2)->{
			if(d1.getTotal_connection_request()==d2.getTotal_connection_request())
			{
				return 0;
			}
			else if(d1.getTotal_connection_request()>d2.getTotal_connection_request())
			
			{
				return 1;
			}
			else
			{
				return -1;
			}
			
		}).get();

		System.out.println(r);
	*/}

}
