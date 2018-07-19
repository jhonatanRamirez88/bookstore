package models;

import java.util.HashSet;
import java.util.Set;

public class Book {
	public Integer id;
	public String title;
	public Integer price;
	public String author;
	
	public Book(Integer id, String title, Integer price, String author) {
		this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
	}
	
	private static Set<Book> books;
	
	static{
		books = new HashSet<>();
		books.add(new Book(1, "Hola", 12, "Juan"));
		books.add(new Book(2, "Hola2", 12, "Juan2"));
		books.add(new Book(3, "Hola3", 12, "Juan3"));
	}
	
	public static Set<Book> allBooks(){
		return books;
	}
	
	
	public static Book findById(Integer id){
		for(Book book : books){
			if(id.equals(book.id)){
				return book;
			}
		}
		return null;
	}
	
	public static void add(Book book){
		books.add(book);
	}
	
	
	public static boolean remove(Book book){
		return books.remove(book);
	}
	
}
