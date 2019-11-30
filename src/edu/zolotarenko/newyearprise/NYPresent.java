package edu.zolotarenko.newyearprise;

public class NYPresent extends Candy {

	private int totalWight;

	public NYPresent(String nameOfCandy, int mass, int sugarContent, int totalWight) {
		super(nameOfCandy, mass, sugarContent);
		this.totalWight = totalWight;
	}

	public int getTotalWight() {
		return totalWight;
	}

	public void setTotalWight(int totalWight) {
		this.totalWight = totalWight;
	}

	
	
}
