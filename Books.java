package abc;
import java.io.*;
import java.util.*;


public class Solution {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id;
		String title,author;
		double price;
		Book books[] = new Book[4];
		for(int i=0;i<4;i++)		
		{
			id = Integer.parseInt(br.readLine());
			title = br.readLine();
			author = br.readLine();
			price = Double.parseDouble(br.readLine());
			books[i] = new Book(id,title,author,price);
			
		}
		String search = br.readLine();
		sortBooksByPrice(search,books);
	}
	public static void sortBooksByPrice(String s,Book[] b)
	{
		ArrayList<Integer> al = new ArrayList<>();
		for(Book b1:b)
		{
			if(b1.getTitle().equalsIgnoreCase(s))
			{
				al.add(b1.getId());
			}
		}
		Collections.sort(al);
		for(int x:al)
		{
			for(Book b1:b)
			{
				if(x==b1.getId())
 				{
					System.out.println(b1.getId());
				}
			}
		}
	}

}
class Book
{
	private int id;
	private String title;
	private String author;
	private double price;
	public Book(int id, String title, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
