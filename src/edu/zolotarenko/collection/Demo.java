package edu.zolotarenko.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Demo {



	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		for ( int i=0; i<1_000_000; i++)
		{
		      list1.add(""+i);
		}
		LinkedList<String> list2=new LinkedList<>();
		
		
		for ( int i=0; i<1_0; i++)
		{
		      list2.add(""+i);
		}
		
		
//		System.out.println(list1.toArray());
		
		System.out.println(list2);
		
//		list1.clear();
		
//		list1.remove("10");
		
//	System.out.println(list1+ "\n"+((DefaultMyList). list1).size1());	

			
//	System.out.println(list1.contains("12"));
		
	}

}
