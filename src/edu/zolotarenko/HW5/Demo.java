package edu.zolotarenko.HW5;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		Book book1 =new Book(001,"Война и мир","Лев Толстой","Эксмо",1965,974,30000,"твердый");
		Book book2 =new Book(002,"Лолита","Владимир Набоков","Киев",2005,368,28000,"кожанный");
		Book book3 =new Book(003,"Шум и ярость","Уильям Фолкнер","Ранок",1995,294,15000,"мягкий");
		Book book4 =new Book(004,"Человек-невидимка","Ральф Эллисон","РИАиздат",2015,617,40000,"твердый");
	
	
//	Stream<Book> bookStream = Stream.of(new Book(001,"Война и мир","Лев Толстой","Эксмо",1965,974,30000,"твердый"),
//			new Book(002,"Лолита","Владимир Набоков","Киев",2005,368,28000,"кожанный"),
//			new Book(003,"Шум и ярость","Уильям Фолкнер","Ранок",1995,294,15000,"мягкий"),
//			new Book(004,"Человек-невидимка","Ральф Эллисон","РИАиздат",2015,617,40000,"твердый"));
//			
     
//      bookStream.filter(p->p.getAuthor()=="Лев Толстой").forEach(p->System.out.println(p.getBookTitle()));
//      bookStream.filter(i->i.getPublisher()=="Ранок").forEach(i->System.out.println(i.getBookTitle()));
//      bookStream.filter(j->j.getPublicationDate()> 2000).forEach(j->System.out.println(j.getBookTitle()));
      
	
	
//	List<Book> places = Arrays.asList(book1, book2,book3,book4);
//	Collection<String> collection = Arrays.asList(book1, book2, book3,book4);
//    Stream<String> streamFromCollection = collection.stream();
//         ArrayList<String> myBookList=new ArrayList<>();
//                   
//         myBookList.add("book1");
		
//       System.out.println(book1.toString());
       
       Collection<Book> collection = Arrays.asList(book1, book2,book3,book4);
       Stream<Book> streamFromCollection = collection.stream();
       
//       System.out.println(collection);
       
      collection.stream().filter(p->p.getAuthor()=="Лев Толстой").forEach(p->System.out.println("Книги Льва Tолстого: "+p.getBookTitle()));
      collection.stream().filter(p->p.getPublisher()=="Ранок").forEach(p->System.out.println("Книги издательства Ранок: "+p.getBookTitle()));
      collection.stream().filter(p->p.getPublicationDate()> 2000).forEach(p->System.out.println("Книги вышедшие после 2000года: "+p.getBookTitle()));
     
}
	
}
