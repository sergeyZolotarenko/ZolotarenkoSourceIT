package edu.zolotarenko.HW5;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		Book book1 =new Book(001,"����� � ���","��� �������","�����",1965,974,30000,"�������");
		Book book2 =new Book(002,"������","�������� �������","����",2005,368,28000,"��������");
		Book book3 =new Book(003,"��� � ������","������ �������","�����",1995,294,15000,"������");
		Book book4 =new Book(004,"�������-���������","����� �������","��������",2015,617,40000,"�������");
	
	
//	Stream<Book> bookStream = Stream.of(new Book(001,"����� � ���","��� �������","�����",1965,974,30000,"�������"),
//			new Book(002,"������","�������� �������","����",2005,368,28000,"��������"),
//			new Book(003,"��� � ������","������ �������","�����",1995,294,15000,"������"),
//			new Book(004,"�������-���������","����� �������","��������",2015,617,40000,"�������"));
//			
     
//      bookStream.filter(p->p.getAuthor()=="��� �������").forEach(p->System.out.println(p.getBookTitle()));
//      bookStream.filter(i->i.getPublisher()=="�����").forEach(i->System.out.println(i.getBookTitle()));
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
       
      collection.stream().filter(p->p.getAuthor()=="��� �������").forEach(p->System.out.println("����� ���� T�������: "+p.getBookTitle()));
      collection.stream().filter(p->p.getPublisher()=="�����").forEach(p->System.out.println("����� ������������ �����: "+p.getBookTitle()));
      collection.stream().filter(p->p.getPublicationDate()> 2000).forEach(p->System.out.println("����� �������� ����� 2000����: "+p.getBookTitle()));
     
}
	
}
