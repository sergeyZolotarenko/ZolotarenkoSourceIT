package edu.zolotarenko.newyearprise;

import java.util.Arrays;

import java.util.List;



public class Running {

	public static void main(String[] args) {
		 
		Candy candy1 =new Candy(CandyName.CANDYNUT,10,50);
		Candy candy2=new Candy(CandyName.RACHKI,5,95);
		Candy candy3 =new Candy(CandyName. SNICKERS, 20,76);
		Candy candy4=new Candy(CandyName.PASTILA,5,0);

		List<Candy> candies = Arrays.asList(candy1, candy2,candy3,candy4);
		
		
		System.out.println(candies);
	}

}
