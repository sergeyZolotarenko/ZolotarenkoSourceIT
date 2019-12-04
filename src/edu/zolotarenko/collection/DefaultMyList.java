package edu.zolotarenko.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class DefaultMyList implements MyList  {

	ArrayList<String> list = new ArrayList<String>();
	
	private String e =new String();
	
	
	
	
	public DefaultMyList(String e) {
		super();
		this.e = e;
	}
	

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public void add(Object e) {
		list.add((String) e);
		
	}


	public void clear() {
		list.clear();
		
	}

	
	public boolean remove(Object e) {
		list.remove(e);
		return true;
	}

	
	public Object[] toArray() {
		String[] listArray = list.stream().toArray(String[]::new);

		 System.out.println("Массив: " + Arrays.toString(listArray));
		 return listArray;
	}


	public int size() {
		list.size();
		return list.size();
	}

	
	public DefaultMyList(ArrayList<String> list) {
		super();
		this.list = list;
	}


	public boolean contains(Object e) {
		list.contains(e);
		return true;
	}

	
	public boolean containsAll(MyList list) {
		list.containsAll(list);
		return true;
	}


	@Override
	public String toString() {
		return "DefaultMyList [list=" + list + "]";
	}




	

}
