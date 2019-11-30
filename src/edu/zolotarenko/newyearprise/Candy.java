package edu.zolotarenko.newyearprise;

public class Candy implements Comparable<Candy> {
	private String nameOfCandy;
	private int mass;
	private int sugarContent;

	public Candy(String nameOfCandy, int mass, int sugarContent) {

		this.nameOfCandy = nameOfCandy;
		this.mass = mass;
		this.sugarContent = sugarContent;
	}

	public String getNameOfCandy() {
		return nameOfCandy;
	}

	public void setNameOfCandy(String nameOfCandy) {
		this.nameOfCandy = nameOfCandy;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("\n").append(" Candy: ").append(nameOfCandy).append(",");
		sb.append(" Mass: ").append(mass).append(",");
		sb.append(" Sugar Content: ").append(sugarContent);

		return sb.toString();
	}
	@Override
	public int compareTo(Candy emp) {
		return (this.mass - emp.mass);
	}
}
