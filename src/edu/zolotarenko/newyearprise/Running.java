package edu.zolotarenko.newyearprise;

import java.util.Arrays;

import java.util.List;



public class Running {

	public static void main(String[] args) {
		 
		Candy candy1 =new Candy("CandyNut",10,50);
		Candy candy2=new Candy("Rachki",5,95);
		Candy candy3 =new Candy("Snickers", 20,76);
		Candy candy4=new Candy("Pastila",5,0);

		List<Candy> present = Arrays.asList(candy1, candy2,candy3,candy4);
		
		
		System.out.println(present);
		
//		int totalMass=0;
//		
//		for (int i=0; i<present.size(); i++) {
//			totalMass+=((Candy) present).getMass();
//		}
//		System.out.println("Общий вес подарка: "+totalMass+"гр.");
		
		  present.stream().filter(p->p.getSugarContent()<80).forEach(p->System.out.println
				  ("Конфеты содержание сахара в которых не превышает 80гр(на 100гр продукта):  "+p.getNameOfCandy()));
		}
	
	}

	

