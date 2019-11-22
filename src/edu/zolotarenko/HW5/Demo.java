package edu.zolotarenko.HW5;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		Book book1 =new Book(001,"Voyna i mir","Lev Tolstoy","ECSMO",1965,974,30000,"Hard");
		Book book2 =new Book(002,"Lolita","Vladimir Nabokov","Kyiv",2005,368,28000,"Leather");
		Book book3 =new Book(003,"Shum i Yarost","William Folkner","Ranok",1995,294,15000,"м€гкий");
		Book book4 =new Book(004,"Chelovek-Nividimka","Ralph Elliston","RIAPub",2015,617,40000,"твердый");
	
	

       
       Collection<Book> collection = Arrays.asList(book1, book2,book3,book4);
       Stream<Book> streamFromCollection = collection.stream();
       

       
      collection.stream().filter(p->p.getAuthor()=="Lev Tolstoy").forEach(p->System.out.println("Lev Tolstoy: "+p.getBookTitle()));
      collection.stream().filter(p->p.getPublisher()=="Ranok").forEach(p->System.out.println("Ranok"+p.getBookTitle()));
      collection.stream().filter(p->p.getPublicationDate()> 2000).forEach(p->System.out.println("After 2000year: "+p.getBookTitle()));
     
}
	
}
